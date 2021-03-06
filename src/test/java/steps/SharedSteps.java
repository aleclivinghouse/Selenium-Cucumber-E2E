package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.LoginActions;
import pages.actions.RegisterActions;
import pages.actions.ProfileWallActions;
//import pages.actions.FriendActions;
//import pages.actions.ProfileActions;
//import pages.actions.WallActions;
import utils.SeleniumDriver;


public class SharedSteps {
	
	LoginActions loginActions = new LoginActions();
	RegisterActions registerActions = new RegisterActions();
	ProfileWallActions profileWallActions = new ProfileWallActions();
  //FriendActions friendActions = new FriendActions();
	
	@Given("^I am on the landing page \"([^\"]*)\" of the website$")
	public void user_navigates_to_landing_page(String url) throws Throwable {
		System.out.println("@Given -- I am on the landing page");
		SeleniumDriver.openPage(url);
	}
	
	@When("^I fill in email with \"([^\"]*)\"")
	public void user_uses_correct_email(String email)  {
		loginActions.LoginInWithRightEmail(); 
	}
	
	@And("^I fill in password with \"([^\"]*)\"")
	public void user_uses_correct_password(String password)  {
	    loginActions.LoginInWithRightPassword();
	}
	
	@And("^I press Sign in$")
	public void i_press_Sign_in() throws Throwable {
		System.out.println("@And -- I press sign in ");
		loginActions.PressSignIn();
	}
	
	@Then("^I should be signed in$")
	public void I_should_be_signed_in() throws Throwable {
		System.out.println("@And -- I should be logged in");
		loginActions.UserIsSignedIn();
	}
	
	@And("^I am redirected to my home page$")
	public void redirected_to_home_page() throws Throwable {
		System.out.println("@And -- I should be logged in");
		loginActions.UserIsSignedIn();
	}
	
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
	
	@And("^I fill in register email with a random string$")
	public void i_fill_in_email_with_a_random_string() throws Throwable {
		System.out.println("@And -- email is a random string");
		registerActions.RegisterWithRandomEmail();
	}
	
	@And("^I fill in reenter email with the same random string$")
	public void i_reenter_email_with_the_same_random_string() throws Throwable {
		System.out.println("@And -- reemail is entered correctly");
		registerActions.EnterCorrectEmailInReenterEmail();
	}
	
	@And("^I fill in register password with a random string$")
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
	
	@When("I log out")
	public void i_log_out() {
	    // Write code here that turns the phrase above into concrete actions
	    profileWallActions.LogOut();
	}	
	
	
//	@Then("^the post does not display on my profile or my wall$")
//	public void the_post_does_not_display_on_my_profile_or_my_wall() throws Throwable {
//		System.out.println("@Then -- the post does not display on my profile or my wall");
//	}
//	
//	@Then("^the like count goes up by one on my profile and on my wall$")
//	public void the_like_count_goes_up() throws Throwable {
//		System.out.println("@Then -- the post does not display on my profile or my wall");
//		profileWallActions.firstPostLikeShowsUp();
//	}
//	

//	
//	@Then("^the last comment on the first post in my profile and on my wall disappears$")
//	public void the_comment_disappears() throws Throwable {
//		System.out.println("@Then -- the last comment on the first post in my profile and on my wall disappears");
//	}
//	
//	

//	

	
	@And("^And I log out$")
	public void log_out(String name) throws Throwable {
		System.out.println("@And -- I log out");
		profileWallActions.LogOut();
	}
}
