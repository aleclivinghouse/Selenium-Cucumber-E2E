package steps;

import cucumber.api.java.en.Given;
import pages.actions.LoginActions;
import utils.SeleniumDriver;


public class SharedSteps {
	
	LoginActions loginActions = new LoginActions();
	
	@Given("^I am on the landing page \"([^\"]*)\" of the website$")
	public void user_navigates_to_landing_page(String url) throws Throwable {
		System.out.println("@Given -- I am on the landing page");
		SeleniumDriver.openPage(url);
	}
	
	/* 
	Shared Login Register 
	 
	When I fill in email with "testuser1@livinghouse.com"
    And I fill in password with "password"
    And I press Sign in
    And I am redirected to my home page
    And I click on my name in the nav
    
	When I fill in firstname with a random string
	And I fill in lastname with a random string
	And I fill in register email with a random string
	And I fill in reenter email with the same random string
	And I fill in register password with a random string
	And I fill in birthmonth with a random month
	And I fill in birthdate with a random number between 1 and 28
    And I fill in year with a random year between 1950 and 2000
	And I fill in one of the gender buttons
	And I press Sign up
    
    
 */
	

	
	/* 
	Shared Wall/Profile/Friends
	 
	And I am redirected to my home page
    Then the post is displayed as the first post on my profile and my wall
    Then the post does not display on my profile or my wall
    Then the like count goes up by one on my profile and on my wall
    Then the comment appears as the last comment on the first post on my profile and on my wall
    Then the last comment on the first post in my profile and on my wall disappears
    Then the comment from the random user shows up as the last comment on the first post on my profile and on my wall
    Then the like count on the first post on my profile and on my wall gets incremented by one
    And I search "testuser 1" and select the first result
 */
	


}
