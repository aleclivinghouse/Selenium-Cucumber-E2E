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
	
	


}
