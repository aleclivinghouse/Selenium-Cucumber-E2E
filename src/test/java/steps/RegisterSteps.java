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
	
	@When("^I fill in firstname with a random string$")
	public void i_fill_in_firstname_with_a_random_string() throws Throwable {
		System.out.println("@When -- firstname is a random string");
		registerActions.FirstNameWithRandomString();
	}
	
	@And("^I fill in lastname with a random string$")
	public void i_fill_in_lastname_with_a_random_string() throws Throwable {
		System.out.println("@And -- lastname is a random string");
		registerActions.LastNameWithRandomString();
	}
	
	@And("^I fill in email with a random string$")
	public void i_fill_in_email_with_a_random_string() throws Throwable {
		System.out.println("@And -- email is a random string");
		registerActions.RegisterWithRandomEmail();
	}
	
	@And("^I fill in reenter email with the same random string$")
	public void i_reenter_email_with_the_same_random_string() throws Throwable {
		System.out.println("@And -- reemail is entered correctly");
		registerActions.EnterCorrectEmailInReenterEmail();
	}
	
	@And("^I fill in password with a random string$")
	public void i_fill_in_password_with_a_random_string() throws Throwable {
		System.out.println("@And -- password is a random string");
		registerActions.RegisterWithRandomPassword();
	}
	
	@And("^I fill in birthmonth with a random month$")
	public void i_fill_in_birthmonth_with_a_random_month() throws Throwable {
		System.out.println("@And -- birthmonth is a random month");
		registerActions.RegisterWithRandomBirthMonth();
	}
	
	@And("^I fill in birthdate with a random number between 1 and 28$")
	public void i_fill_in_birthdate_with_a_random_birthdate() throws Throwable {
		System.out.println("@And -- birthdate is a random birthdate");
		registerActions.RegisterWithRandomBirthDate();
	}
	
	@And("^I fill in year with a random year between 1950 and 2000$")
	public void i_fill_in_birthdate_with_a_random_birthyear() throws Throwable {
		System.out.println("@And -- birthyear is a random birthyear");
		registerActions.RegisterWithRandomBirthYear();
	}
	
	@And("^I fill in one of the gender buttons$")
	public void i_fill_in_one_of_the_gender_buttons() throws Throwable {
		System.out.println("@And -- one of the two gender buttons is pressed");
		registerActions.RegisterGender();
	}
	
	@And("^I press Sign up$")
	public void i_press_sign_up() throws Throwable {
		System.out.println("@And -- I press sign up");
		registerActions.PressSignUp();
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
}
