package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.RegisterActions;
import utils.SeleniumDriver;

public class RegisterSteps {
	
	RegisterActions registerActions = new RegisterActions();
	
	
	@And("^I fill in register email with the username \"([^\"]*)\"$")
	public void i_fill_in_email_with_the_user_name(String username) throws Throwable {
		System.out.println("@And -- email is a testuser1@livinghouse.com");
		registerActions.RegisterWithEmailAlreadyTaken(username);
	}
	
	@And("^I fill in reenter email with the username \"([^\"]*)\"$")
	public void i_fill_in_reenter_email_with_the_user_name(String username) throws Throwable {
		System.out.println("@And -- reenter email is a testuser1@livinghouse.com");
		registerActions.ReenterEmailAlreadyTaken(username);
	}
	
	
	@Then("^I should be redirected to my home page$")
	public void i_should_be_redirected_to_my_home_page() throws Throwable {
		System.out.println("@Then -- I should be redirected to my home page");
		registerActions.redirectedToHomePage();
	}
	
	@Then("^I should get an error message$")
	public void i_should_get_an_error_message() throws Throwable {
		System.out.println("@Then -- I should get an error message");
		registerActions.errorMessage();
	}
	
	@When("I fill in reenter email with a different random string")
	public void i_fill_in_reenter_email_with_a_different_random_string() {
	    System.out.println("@When -- I reenter email with a different random string");
		registerActions.EnterIncorrectEmailInReenterEmail();
	}
}
