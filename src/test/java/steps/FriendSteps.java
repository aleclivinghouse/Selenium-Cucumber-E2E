package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.actions.LoginActions;
//import pages.actions.FriendActions;
import pages.actions.RegisterActions;

public class FriendSteps {
	LoginActions loginActions = new LoginActions();
	RegisterActions registerActions = new RegisterActions();
//	FriendActions friendActions = new FriendActions();
	
	@And("^I open my notifications and accept the friend request$")
	public void i_accept_friend_request() throws Throwable {
		System.out.println("@And -- I open my notifications and accept the friend request");
	}
	
	@And("^I search for the random user and click on his profile$")
	public void i_search_user_click_profile() throws Throwable {
		System.out.println("@And -- I search for the random user and click on his profile");
	}
	
	@Then("^his profile says we are friends$")
	public void his_profile_says_we_are_friends() throws Throwable {
		System.out.println("@Then -- says we are friends");
	}
	
	@And("^I open my notifications and reject the friend request$")
	public void i_reject_friend_request() throws Throwable {
		System.out.println("@And -- I open my notifications and reject the friend request");
	}
	
	@Then("^his profile does not say we are friends$")
	public void his_profile_says_we_are_not_friends() throws Throwable {
		System.out.println("@Then -- does not say we are friends");
	}
	
}
