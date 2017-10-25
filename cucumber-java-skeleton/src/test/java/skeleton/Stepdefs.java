package skeleton;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
        int leftCukes = (int) belly.eat(cukes);
        assertEquals(leftCukes, 1);
    }
    //When I wait 1 hour
    //Then my belly should growl

    @When("^I wait (\\d+) hour$")
    public void waitTime(int hours) throws Throwable{
    	Belly belly = new Belly();
        belly.wait(hours);
    }
    
    @Then("^my belly should growl")
    public void grow() throws Throwable{
    	Belly belly = new Belly();
        belly.grow();
    }
    
    
}
