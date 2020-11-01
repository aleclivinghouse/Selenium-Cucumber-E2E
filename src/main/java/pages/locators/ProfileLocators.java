package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfileLocators {

	//cover photo
	@FindBy(how=How.ID ,using="profile-cover-input")
	public WebElement uploadCoverPhoto;
	
	//change profile info
	@FindBy(how=How.NAME ,using="birthday")
	public WebElement changeBirthDay;
	
	@FindBy(how=How.NAME ,using="relationship")
	public WebElement changeRelationShipStatus;
	
	@FindBy(how=How.NAME ,using="school")
	public WebElement changeSchool;
	
	@FindBy(how=How.NAME ,using="workplace")
	public WebElement changeWork;
	
	@FindBy(how=How.NAME ,using="current_town")
	public WebElement changeCurrentTown;
	
	@FindBy(how=How.XPATH ,using="//*[@id=\"root\"]/div/section/div[2]/div/div")
	public WebElement aboutUserSubmit;
	
	//profile pic 
	@FindBy(how=How.ID ,using="profile-pic-input")
	public WebElement changeProfilePic;
	
	//post form
	@FindBy(how=How.NAME ,using="body")
	public WebElement postTextArea;
	
	@FindBy(how=How.ID ,using="post-pic-input")
	public WebElement postPic;
	
	@FindBy(how=How.XPATH ,using="//*[@id=\"root\"]/div/section/div[3]/div/div[1]/form/div[2]/button")
	public WebElement postSubmit;
	
	//the text of the first post on the profile feed
	@FindBy(how=How.XPATH ,using="//*[@id=\"root\"]/div/section/div[3]/div/div[2]/div[1]/div[2]/div/div[1]")
	public WebElement firstPostInFeed;
	
	//like the first post in the feed
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[3]/div/div[2]/div[1]/div[3]/div[1]")
	public WebElement likeFirstPostInFeed;
	
	//like count of the first post in the feed
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[3]/div/div[2]/div[2]/div[1]")
	public WebElement firstPostInFeedLikeCount;
	
	//edit/delete post dropdown
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[3]/div/div[2]/div[1]/div[1]/div[3]")
	public WebElement editDeletePostDropdown;
	
	//edit post
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[3]/div/div[2]/div[1]/div[1]/div[3]/div/ul/li[1]")
	public WebElement editPost;
	
	//delete post
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[3]/div/div[2]/div[1]/div[1]/div[3]/div/ul/li[2]")
	public WebElement deletePost;
	
	//comments
	//select the last comment made on the first post in the feed
	@FindBy(how=How.XPATH ,using="(/html/body/main/div/section/div[3]/div/div[2]/div[2]/div/div/div)[last()-1]/div[2]/div[2]")
	public WebElement lastCommentOnFirstPostInFeed;
	
	//delete the last comment made on the first post in the feed
	@FindBy(how=How.XPATH ,using="(/html/body/main/div/section/div[3]/div/div[2]/div[2]/div/div/div)[last()-1]/div[3]")
	public WebElement deleteLastCommentOnFirstPostInFeed;
	
	//The input field to write a comment on the first post in the feed
	@FindBy(how=How.XPATH ,using="(/html/body/main/div/section/div[3]/div/div[2]/div[2]/div/div/div)[last()]/form/input")
	public WebElement inputFieldCommentOnFirstPostInFeed;
	 
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////
	//second
	///html/body/main/div/section/div[3]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]
	//first
	///html/body/main/div/section/div[3]/div/div[2]/div[2]/div/div/div[1]/div[2]/div[2]
	
	
	
	
}
