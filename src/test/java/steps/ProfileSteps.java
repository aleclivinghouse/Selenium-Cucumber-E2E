package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.actions.LoginActions;
import pages.actions.RegisterActions;
//import pages.actions.ProfileActions;

public class ProfileSteps {
	RegisterActions registerActions = new RegisterActions();
//	ProfileActions profileActions = new ProfileActions();
	
	@And("^I click on my name in the nav$")
	public void i_click_on_my_name_in_the_nav() throws Throwable {
		System.out.println("@And -- I click on my name in the nav");
	}
	
	@And("^I am redirected to my profile page$")
	public void i_am_redirected_to_the_profile_page() throws Throwable {
		System.out.println("@And -- I am redirected to my profile page");
	}
	
	@And("^I change my birthday$")
	public void i_change_my_birthday() throws Throwable {
		System.out.println("@And -- I change my birthday");
	}
	
	@Then("^my birthday should appear on the screen$")
	public void my_birthday_appears_on_screen() throws Throwable {
		System.out.println("@And -- birthday appears on screen");
	}
	
	@And("^I change my relationship status$")
	public void i_change_my_relationship_status() throws Throwable {
		System.out.println("@And -- I change my relationship status");
	}
	
	@Then("^my relationship status should appear on the screen$")
	public void my_relationship_status_appears_on_screen() throws Throwable {
		System.out.println("@And -- relationship status appears on screen");
	}
	
	@And("^I change my school$")
	public void i_change_my_school() throws Throwable {
		System.out.println("@And -- change school");
	}
	
	@Then("^my school should appear on the screen$")
	public void my_school_appears_on_screen() throws Throwable {
		System.out.println("@Then -- school appears on screen");
	}
	
	@And("^I change my work$")
	public void i_change_my_work() throws Throwable {
		System.out.println("@And -- change work");
	}
	
	@Then("^my work should appear on the screen$")
	public void my_work_appears_on_screen() throws Throwable {
		System.out.println("@Then -- work appears on screen");
	}
	
	@And("^I change my city$")
	public void i_change_my_city() throws Throwable {
		System.out.println("@And -- change city");
	}
	
	@Then("^my city should appear on the screen$")
	public void my_city_appears_on_screen() throws Throwable {
		System.out.println("@Then -- city appears on screen");
	}
	
	@And("^I upload a new cover photo$")
	public void i_upload_new_cover_photo() throws Throwable {
		System.out.println("@And -- upload new cover photo");
	}

	@Then("^my new cover photo should appear on the screen$")
	public void my_cover_photo_appears_on_screen() throws Throwable {
		System.out.println("@Then -- cover photo appears on screen");
	}
	
	@And("^I upload a new profile picture$")
	public void i_upload_new_profile_picture() throws Throwable {
		System.out.println("@And -- upload new profile picture");
	}
	
	@Then("^my new profile picture should appear on the screen$")
	public void my_profile_picture_appears_on_screen() throws Throwable {
		System.out.println("@Then -- profile picture appears on screen");
	}
	
	@And("^I am redirected to my profile page$")
	public void i_am_redirected_to_my_profile_page() throws Throwable {
		System.out.println("@And -- I am redirected to my profile page");
	}
	
	@And("^I upload a post on my profile with just text$")
	public void i_upload_a_post_just_text() throws Throwable {
		System.out.println("@And -- I upload a post on my profile with just text");
	}
	
	@And("^I upload a post with text and an image on my profile$")
	public void i_upload_a_post_text_image() throws Throwable {
		System.out.println("@And -- I upload a post on my profile with text image");
	}
	
	@And("^I upload a post with just an image on my profile$")
	public void i_upload_a_post_just_image() throws Throwable {
		System.out.println("@And -- I upload a post on my profile with just an image");
	}
	
	@And("^I click on the like button for the first post on my profile$")
	public void i_clcik_the_like_button_profile() throws Throwable {
		System.out.println("@And -- I click the like button on my profile");
	}
	
	@And("^I enter a comment on the first post in my profile$")
	public void i_enter_comment_profile() throws Throwable {
		System.out.println("@And -- I enter comment on my profile");
	}
	
	@And("^I delete the last comment on the first post on my profile$")
	public void i_delete_comment_profile() throws Throwable {
		System.out.println("@And -- I delete comment on my profile");
	}
	
	@And("^I post on his feed$")
	public void i_post_on_his_feed() throws Throwable {
		System.out.println("@And -- I post on his feed");
	}
	
	@And("^I comment on the first post in his feed$")
	public void i_comment_first_post_on_his_feed() throws Throwable {
		System.out.println("@And -- I comment post on his feed");
	}
	
	@And("^I like the first post in his feed$")
	public void i_like_first_post_on_his_feed() throws Throwable {
		System.out.println("@And -- I like post on his feed");
	}
	
}
