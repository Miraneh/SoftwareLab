package com.unittest.codecoverage.service;

import com.unittest.codecoverage.exceptions.PersonException;
import com.unittest.codecoverage.models.StreetDirectionFlow;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.unittest.codecoverage.exceptions.BehaviorException;
import com.unittest.codecoverage.models.Footpassenger;
import com.unittest.codecoverage.models.Traffic;
import com.unittest.codecoverage.models.TrafficLigth;
import com.unittest.codecoverage.services.TrafficBehaviorService;
import com.unittest.codecoverage.services.impl.TrafficBehaviorServiceImpl;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

public class TrafficBehaviorServiceTest {
	
	private TrafficBehaviorService trafficBehaviorService = new TrafficBehaviorServiceImpl();
	
	@Test
	public void testFootpassengerCrossTheStreet_shouldThrowBehaviorExceptionWhenFootpassengerCrossesTheRoadDuringHeavyTrafficAndWhileTheTrafficLightIsRed() {
	
		Traffic currentTrafic = new Traffic();
		currentTrafic.setIntenseCarTraffic(true);
		
		Footpassenger currentFootpassengerBehavior = new Footpassenger();
		currentFootpassengerBehavior.setCrossedTheRoad(true);
		currentFootpassengerBehavior.setCrossedTrafficLigth(TrafficLigth.RED);
		
		Assertions.assertThatThrownBy(() -> trafficBehaviorService.footpassengerCrossTheStreet(currentTrafic, currentFootpassengerBehavior))
			.isInstanceOf(BehaviorException.class)
			.hasMessageContaining("You should'nt do that, reckless person");
		
	}
	
	@Test
	@DisplayName("Should throw exception when footpassenger crosses the road during heavy traffic without attention")
	public void testFootpassengerCrossTheStreet_shouldThrowBehaviorExceptionWhenFootpassengerCrossesTheRoadDuringHeavyTrafficWithoutLookSides() {
	
		Traffic currentTrafic = new Traffic();
		currentTrafic.setIntenseCarTraffic(true);
		currentTrafic.setStreetDirectionFlow(StreetDirectionFlow.TWO_WAY);
		currentTrafic.setCurrentTrafficLight(TrafficLigth.RED);
		
		Footpassenger currentFootpassengerBehavior = new Footpassenger();
		currentFootpassengerBehavior.setCrossedTheRoad(true);
		currentFootpassengerBehavior.setCrossedTrafficLigth(TrafficLigth.GREEN);
		currentFootpassengerBehavior.setLookedToTheLeft(false);
		currentFootpassengerBehavior.setLookedToTheRight(false);

		assertEquals(currentTrafic.getCurrentTrafficLight(), TrafficLigth.RED);
		assertEquals(currentTrafic.getStreetDirectionFlow(), StreetDirectionFlow.TWO_WAY);
		
		Assertions.assertThatThrownBy(() -> trafficBehaviorService.footpassengerCrossTheStreet(currentTrafic, currentFootpassengerBehavior))
			.isInstanceOf(BehaviorException.class)
			.hasMessage("You should be more careful");

	}

	@Test
	@DisplayName("Shouldn't do anything when footpassenger crosses the crossroad when the traffic light is green and pays attention")
	public void testFootpassengerCrossTheCrossroad_shouldDoNothingWhenFootpassengerCrossesTheCrossroadDuringGreenLightAndLookSides() {

		Traffic currentTrafic = new Traffic();
		currentTrafic.setIntenseCarTraffic(true);

		Footpassenger currentFootpassengerBehavior = new Footpassenger();
		currentFootpassengerBehavior.setCrossedTheCrosswalk(true);
		currentFootpassengerBehavior.setCrossedTrafficLigth(TrafficLigth.GREEN);
		currentFootpassengerBehavior.setLookedToTheLeft(true);
		currentFootpassengerBehavior.setLookedToTheRight(true);

		assertTrue(currentFootpassengerBehavior.crossedTheCrosswalk());

		assertAll(() -> trafficBehaviorService.footpassengerCrossTheStreet(currentTrafic, currentFootpassengerBehavior));
	}

	@Test
	@DisplayName("Shouldn't do anything when footpassenger crosses the one-way street when the traffic light is yellow and traffic is not intense")
	public void testFootpassengerCrossTheRoad_shouldDoNothingWhenFootpassengerCrossesTheRoadDuringYellowLightAndNotIntenseTraffic() {

		Traffic currentTrafic = new Traffic();
		currentTrafic.setIntenseCarTraffic(false);
		currentTrafic.setStreetDirectionFlow(StreetDirectionFlow.ONE_WAY);
		currentTrafic.setMinSpeedAllowed((short) 20);
		currentTrafic.setMaxSpeedAllowed((short) 40);

		Footpassenger currentFootpassengerBehavior = new Footpassenger();
		currentFootpassengerBehavior.setCrossedTheRoad(true);
		currentFootpassengerBehavior.setCrossedTrafficLigth(TrafficLigth.YELLOW);

		assertEquals(currentTrafic.getMinSpeedAllowed(), 20);
		assertEquals(currentTrafic.getMaxSpeedAllowed(), 40);

		assertAll(() -> trafficBehaviorService.footpassengerCrossTheStreet(currentTrafic, currentFootpassengerBehavior));
	}
}
