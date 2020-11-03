package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.actions.LoginActions;
import utils.SeleniumDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class LoginSteps {
	LoginActions loginActions = new LoginActions();
	
	@When("^I fill in email with a random string$")
	public void user_fills_in_email_with_random_string() throws Throwable {
		System.out.println("@Given -- emasil is a random string");
		loginActions.LoginInWithRandomEmail();
	}
	
	@And("^I fill in password with a random string$")
	public void user_fills_in_passsword_with_random_string() throws Throwable {
		System.out.println("@And -- password is a random string");
		loginActions.LoginInWithRandomPassword();
	}
	
	
	@Then("^I should not be signed in$")
	public void user_should_not_be_signed_in() throws Throwable {
		System.out.println("@And -- I should not be logged in");
		loginActions.UserIsNotSignedIn();
	}
	

	@And("^I fill in password with wrongpassword")
	public void user_uses_incorrect_password()  {
	    loginActions.WrongPassword();
	}
	
	
	
}
