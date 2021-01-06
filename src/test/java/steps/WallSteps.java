package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.LoginActions;
import pages.actions.RegisterActions;
import pages.actions.ProfileWallActions;

public class WallSteps {
	LoginActions loginActions = new LoginActions();
	RegisterActions registerActions = new RegisterActions();
	ProfileWallActions profileWallActions = new ProfileWallActions();
	@And("^I upload a post on my wall with just text$")
	public void i_upload_post_wall_just_text() throws Throwable {
		System.out.println("@And -- I upload a post on my wall with just text");
		profileWallActions.postJustTextWall();
	}
	
	@And("^I upload a post with just an image on my wall$")
	public void i_upload_post_just_image() throws Throwable {
		System.out.println("@And -- I upload a post on my wall with just image");
	}
	
	@And("^I click on the like button for the first post on my wall$")
	public void i_click_like_button_wall() throws Throwable {
		System.out.println("@And -- I hit like button wall");
		profileWallActions.likeFirstPostOnWall();
	}
	
	@And("^I enter a comment on the first post in my wall$")
	public void i_enter_comment_wall() throws Throwable {
		profileWallActions.postCommentWall();
	}
	
	
	@Then("the post is displayed as the first post on my profile and my wall")
	public void the_post_is_displayed_as_the_first_post_on_my_profile_and_my_wall() throws Throwable {
		profileWallActions.newPostShowsOnWallAndProfile();
	}

	@Then("the like count goes up by one on my profile and on my wall")
	public void the_like_count_goes_up_by_one_on_my_profile_and_on_my_wall() throws Throwable {
		profileWallActions.firstPostLikeShowsOnWallAndProfile();
	}

	@Then("the comment appears as the last comment on the first post on my profile and on my wall")
	public void the_comment_appears_as_the_last_comment_on_the_first_post_on_my_profile_and_on_my_wall() throws Throwable {
		profileWallActions.newCommentShowsOnWallAndProfile();
	}
	
	
}
