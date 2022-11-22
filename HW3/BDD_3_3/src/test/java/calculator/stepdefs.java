package calculator;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import org.junit.Assert;
//import org.junit.Before;

public class stepdefs {
    private Calculator calculator;
    private float value1;
    private float value2;
    private long result;

    @Before
    public void before() { calculator = new Calculator();}

    @Given("Two input values, {float} and {float}")
    public void inputValues(float arg0, float arg1) {

        value1 = arg0;
        value2 = arg1;
    }

    @When("I take the square root of the division of the first by the second")
    public void divideAndSquareRoot() {
        if(value1 == 0 && value2 == 0){
            result = -1;
        }
        else if(value2 == 0){
            result = -1;
        }else if(value1*value2 < 0){
            result = -1;
        }else{
            result = calculator.squareRoot(calculator.divide(value1, value2));
        }

    }

    @Then("I expect the result {double}")
    public void expectResult(double arg0) { Assert.assertEquals((long)arg0, result);}


}
