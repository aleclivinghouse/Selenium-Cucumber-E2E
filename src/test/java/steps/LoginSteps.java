package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class LoginSteps {
	
	@When("^I fill in email with a random string$")
	public void user_fills_in_email_with_random_string() throws Throwable {
		System.out.println("@Given -- emasil is a random string");
	}
	
	@And("^I fill in password with a random string$")
	public void user_fills_in_passsword_with_random_string() throws Throwable {
		System.out.println("@And -- password is a random string");
	}
	
	@And("^I press Sign In$")
	public void user_presses_signin() throws Throwable {
		System.out.println("@And -- I press sign in ");
	}
	
	@Then("^I should not be signed in$")
	public void user_should_not_be_signed_in() throws Throwable {
		System.out.println("@And -- I should not be logged in");
	}
	
	@When("^I fill in email with \"([^\"]*)\"")
	public void user_uses_correct_email(String email)  {
	    
	}
	
	@And("^I fill in password with wrongpassword")
	public void user_uses_incorrect_password()  {
	    
	}
	
	@And("^I fill in password with \"([^\"]*\"")
	public void user_uses_correct_password(String password)  {
	    
	}
	
	
}
