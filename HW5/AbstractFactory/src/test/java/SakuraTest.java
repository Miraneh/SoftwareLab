import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SakuraTest {

    @Test
    void printTree() {
        AbstractGardenCreator gardenCreator = Client.getGarden("Japanese");
        AbstractFlower flower1 = gardenCreator.setFlower();
        assertEquals(flower1.printFlower(), "Inside Sakura::printFlower() method");
    }
}