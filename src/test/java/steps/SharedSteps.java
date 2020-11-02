package steps;

import cucumber.api.java.en.Given;


public class SharedSteps {
	
	@Given("^I am on the landing page$")
	public void user_navigates_to_facebook_website() throws Throwable {
		System.out.println("@Given -- I am on the landing page");
	}

}
