package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeLocators {
	
	//post locators
	//post input
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[2]/div/div[1]/form/div[1]/textarea")
	public WebElement postInput;
	
	//post submit
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[2]/div/div[1]/form/div[2]/button")
	public WebElement postSubmit;
	
	//post photo button
	@FindBy(how=How.ID ,using="post-pic-input")
	public WebElement postPic;
	
	//first post text
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[2]/div/div[2]/div[1]/div[2]/div/div[1]")
	public WebElement FirstPostText;
	
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[2]/div/div[2]/div[1]/div[1]/div[2]/a")
	public WebElement firstPostAuthor;
	
	//tagged user in post
	//NOTE this will have to be changed
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[2]/div/div[2]/div[1]/div[1]/div[2]/div[1]")
	public WebElement firstPostTaggedUser;
	
	// first post like button
	@FindBy(how=How.ID ,using="/html/body/main/div/section/div[2]/div/div[2]/div[1]/div[3]/div[1]")
	public WebElement likeFirstPost;
	
	//first post like count
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[2]/div/div[2]/div[2]/div[1]")
	public WebElement firstPostLikeCount;
	
	//first post edit/delete dropdown
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[2]/div/div[2]/div[1]/div[1]/div[3]]")
	public WebElement firstPostEditDeleteDropdown;
	
	//first post edit
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[2]/div/div[2]/div[1]/div[1]/div[3]/div/ul/li[1]")
	public WebElement firstPostEdit;
	
	//first post delete
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[2]/div/div[2]/div[1]/div[1]/div[3]/div/ul/li[2]")
	public WebElement firstPostDelete;
	
	//comment locators
	//comment on first post input
	@FindBy(how=How.XPATH ,using="(/html/body/main/div/section/div[2]/div/div[2]/div[2]/div[2]/div/div)[last()]/form/input")
	public WebElement firstPostCommentInput;
	
	//the last comment on the first post
	@FindBy(how=How.XPATH ,using="(/html/body/main/div/section/div[2]/div/div[2]/div[2]/div[2]/div/div)[last()-1]/div[2]/div[2]")
	public WebElement firstPostLastComment;
	
	//author of the last comment made on the first post
	@FindBy(how=How.XPATH ,using="(/html/body/main/div/section/div[2]/div/div[2]/div[2]/div[2]/div/div)[last()-1]/div[2]/div[1]")
	public WebElement firstPostLastCommentAuthor;
	
	//delete the last comment on the first post
	@FindBy(how=How.XPATH ,using="(/html/body/main/div/section/div[2]/div/div[2]/div[2]/div[2]/div/div)[last()-1]/div[3]")
	public WebElement firstPostLastCommentDelete;
	
	

}
