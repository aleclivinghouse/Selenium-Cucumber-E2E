package steps;

import cucumber.api.java.en.And;
import pages.actions.LoginActions;
import pages.actions.RegisterActions;
//import pages.actions.WallActions;

public class WallSteps {
	LoginActions loginActions = new LoginActions();
	RegisterActions registerActions = new RegisterActions();
//	WallActions wallActions = new WallActions();
	@And("^I upload a post on my wall with just text$")
	public void i_upload_post_wall_just_text() throws Throwable {
		System.out.println("@And -- I upload a post on my wall with just text");
	}
	
	@And("^I upload a post with text and an image on my wall$")
	public void i_upload_post_wall_image_text() throws Throwable {
		System.out.println("@And -- I upload a post on my wall with image + text");
	}
	
	@And("^I upload a post with just an image on my wall$")
	public void i_upload_post_just_image() throws Throwable {
		System.out.println("@And -- I upload a post on my wall with just image");
	}
	
	@And("^I click on the like button for the first post on my wall$")
	public void i_click_like_button_wall() throws Throwable {
		System.out.println("@And -- I hit like button wall");
	}
	
	@And("^I enter a comment on the first post in my wall$")
	public void i_enter_comment_wall() throws Throwable {
		System.out.println("@And -- I enter comment wall");
	}
	
	@And("^I delete the last comment on the first post on my wall$")
	public void i_delete_comment_wall() throws Throwable {
		System.out.println("@And -- I delete comment wall");
	}
	
	@And("^I comment on the first post in his feed$")
	public void i_comment_post_wall() throws Throwable {
		System.out.println("@And -- I comment on the first post in his feed");
	}
	
	@And("^I like the first post in his feed$")
	public void i_like_post_wall() throws Throwable {
		System.out.println("@And -- I like the first post in his feed");
	}
	
}
