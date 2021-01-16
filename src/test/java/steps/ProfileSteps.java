package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.LoginActions;
import pages.actions.RegisterActions;
import utils.SeleniumDriver;
import pages.actions.ProfileWallActions;

public class ProfileSteps {
	RegisterActions registerActions = new RegisterActions();
	ProfileWallActions profileWallActions = new ProfileWallActions();
	
	@And("^I click on my name in the nav$")
	public void i_click_on_my_name_in_the_nav() throws Throwable {
		System.out.println("@And -- I click on my name in the nav");
		profileWallActions.clickOnNameInNav();
	}
	
	@And("^I am redirected to my profile page$")
	public void i_am_redirected_to_the_profile_page() throws Throwable {
		System.out.println("@And -- I am redirected to my profile page");
		profileWallActions.redirectedToProfilePage();
	}
	
	@And("^I upload a post on my profile with just text$")
	public void i_upload_a_post_just_text() throws Throwable {
		System.out.println("@And -- I upload a post on my profile with just text");
		profileWallActions.postJustTextProfile();
		
	}
	
	@And("^I change my birthday$")
	public void i_change_my_birthday() throws Throwable {
		System.out.println("@And -- I change my birthday");
		profileWallActions.changeBirthday();
	}
	
	@Then("the comment appears as the last comment on the first post on my profile and on my wall")
	public void the_comment_appears_as_the_last_comment_on_the_first_post_on_my_profile_and_on_my_wall() throws Throwable {
		profileWallActions.newCommentShowsOnWallAndProfile();
	}
	
	@Then("the comment from the random user shows up as the last comment on the first post on my profile and on my wall$")
	public void the_comment_appears_from_the_random_user() throws Throwable {
		System.out.println("@Then -- Then the comment from the random user shows up as the last comment on the first post on my profile and on my wall");
		profileWallActions.newCommentShowsOnWallAndProfile();
	}
	
	@And("^I delete the last comment on the first post on my profile$")
	public void i_delete_comment_profile() throws Throwable {
		System.out.println("@And -- I delete comment on my profile");
		profileWallActions.deleteCommentProfile();
	}
	
	@And("^I click on the like button for the first post on my profile$")
	public void i_clcik_the_like_button_profile() throws Throwable {
		profileWallActions.likeFirstPostOnProfile();
	}
	
	@And("^I enter a comment on the first post in my profile$")
	public void i_enter_comment_profile() throws Throwable {
		System.out.println("@And -- I enter comment on my profile");
		profileWallActions.postCommentProfile();
	}
	
	@Then("^my birthday should appear on the screen$")
	public void my_birthday_appears_on_screen() throws Throwable {
		System.out.println("@And -- birthday appears on screen");
		profileWallActions.newBirthdayOnScreen();
	}
	
	@And("^I change my relationship status$")
	public void i_change_my_relationship_status() throws Throwable {
		System.out.println("@And -- I change my relationship status");
		profileWallActions.changeRelationshipStatus();
	}
	
	@Then("^my relationship status should appear on the screen$")
	public void my_relationship_status_appears_on_screen() throws Throwable {
		System.out.println("@And -- relationship status appears on screen");
		profileWallActions.newRelationShipStatusOnScreen();
	}
	
	@And("^I change my school$")
	public void i_change_my_school() throws Throwable {
		System.out.println("@And -- change school");
		profileWallActions.changeSchool();
	}
	
	@Then("^my school should appear on the screen$")
	public void my_school_appears_on_screen() throws Throwable {
		System.out.println("@Then -- school appears on screen");
		profileWallActions.newSchoolOnScreen();
	}
	
	@And("^I change my work$")
	public void i_change_my_work() throws Throwable {
		System.out.println("@And -- change work");
		profileWallActions.changeWork();
	}
	
	@Then("^my work should appear on the screen$")
	public void my_work_appears_on_screen() throws Throwable {
		System.out.println("@Then -- work appears on screen");
		profileWallActions.newWorkOnScreen();
	}
	
	@And("^I change my city$")
	public void i_change_my_city() throws Throwable {
		System.out.println("@And -- change city");
		profileWallActions.changeCity();
	}
	
	@Then("^my city should appear on the screen$")
	public void my_city_appears_on_screen() throws Throwable {
		System.out.println("@Then -- city appears on screen");
		profileWallActions.newCityOnScreen();
	}
	
	//start
	@Then("^from profile the like count goes up by one on my profile and on my wall$")
	public void the_like_count_goes_up() throws Throwable {
		System.out.println("@Then -- the post does not display on my profile or my wall");
		profileWallActions.firstPostLikeShowsOnWallAndProfile();
	}
	
	@Then("^from profile the last comment on the first post in my profile and on my wall disappears$")
	public void the_comment_disappears() throws Throwable {
		System.out.println("@Then -- the last comment on the first post in my profile and on my wall disappears");
	}
	
	//end
//	
//	@And("^I upload a new cover photo$")
//	public void i_upload_new_cover_photo() throws Throwable {
//		System.out.println("@And -- upload new cover photo");
//	}
//
//	@Then("^my new cover photo should appear on the screen$")
//	public void my_cover_photo_appears_on_screen() throws Throwable {
//		System.out.println("@Then -- cover photo appears on screen");
//	}
//	
//	@And("^I upload a new profile picture$")
//	public void i_upload_new_profile_picture() throws Throwable {
//		System.out.println("@And -- upload new profile picture");
//	}
//	
//	@Then("^my new profile picture should appear on the screen$")
//	public void my_profile_picture_appears_on_screen() throws Throwable {
//		System.out.println("@Then -- profile picture appears on screen");
//	}
//	
//	@And("^I am redirected to my profile page$")
//	public void i_am_redirected_to_my_profile_page() throws Throwable {
//	z
//	
//	@And("^I comment on the first post in his feed$")
//	public void i_comment_first_post_on_his_feed() throws Throwable {
//		System.out.println("@And -- I comment post on his feed");
//	}
//	
//	@And("^I like the first post in his feed$")
//	public void i_like_first_post_on_his_feed() throws Throwable {
//		System.out.println("@And -- I like post on his feed");
//	}
	
//	
	@And("^I upload a post with text and an image on my wall$")
	public void i_upload_post_wall_image_text() throws Throwable {
		profileWallActions.postTexImageWall();
	}
	
	@And("^I upload a post with text and an image on my profile")
	public void i_upload_post_profile_image_text() throws Throwable {
		profileWallActions.postTextImageProfile();
	}
	
	@Then("the post is displayed as the first post on my profile and the text and the image are both included")
	public void the_post_is_displayed_as_the_first_post_on_my_profile_and_the_text_and_the_image_are_both_included() throws Throwable {
	   profileWallActions.postTextImageProfileShowsUp();
	}
	
	@When("I upload a post with just an image on my profile")
	public void i_upload_a_post_with_just_an_image_on_my_profile() throws Throwable {
	   profileWallActions.postJustImageProfile();
	}

	@Then("the post does not display on my profile or my wall")
	public void the_post_does_not_display_on_my_profile_or_my_wall() throws Throwable {
		 profileWallActions.postJustImageProfileShowsUp();
	}

//	
//	@And("^I upload a post with just an image on my wall$")
//	public void i_upload_post_just_image() throws Throwable {
//		System.out.println("@And -- I upload a post on my wall with just image");
//	}
//	
//	@And("^I click on the like button for the first post on my wall$")
//	public void i_click_like_button_wall() throws Throwable {
//		System.out.println("@And -- I hit like button wall");
//	}
//	
//	@And("^I enter a comment on the first post in my wall$")
//	public void i_enter_comment_wall() throws Throwable {
//		System.out.println("@And -- I enter comment wall");
//	}
//	
//	@And("^I delete the last comment on the first post on my wall$")
//	public void i_delete_comment_wall() throws Throwable {
//		System.out.println("@And -- I delete comment wall");
//	}
	
	@Then("^the last comment on the first post in my profile and on my wall disappears$")
	public void comment_dissapears() throws Throwable {
		System.out.println("@And -- I delete comment wall");
		profileWallActions.commentIsDeletedOnWallAndProfile();
	}
//	
//	
//	@And("^I like the first post in his feed$")
//	public void i_like_post_wall() throws Throwable {
//		System.out.println("@And -- I like the first post in his feed");
//	}
//	
	@Then("^the post I wrote on my profile is displayed as the first post on my profile and my wall$")
	public void the_post_profile_displayed_as_the_first_profile_on_my_wall() throws Throwable {
		profileWallActions.newPostShowsOnWallAndProfile();
	}
	
	
	
}
