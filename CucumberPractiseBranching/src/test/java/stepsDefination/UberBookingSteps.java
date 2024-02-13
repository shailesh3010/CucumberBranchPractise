package stepsDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	
	
	@Given("User wants to select a car Type {string} from uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String string) {
	  System.out.println("");
	}

	@When("user selects car {string} and pick up point {string} and drop location {string}")
	public void user_selects_car_and_pick_up_point_and_drop_location(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Driver ends the Journey")
	public void driver_ends_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User pays the {int} USD")
	public void user_pays_the_usd(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
