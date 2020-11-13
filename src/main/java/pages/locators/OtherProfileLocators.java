package pages.locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OtherProfileLocators {
	//add friend button
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[1]/div[1]/div[2]/div/div")
	public WebElement addFriend;
	
	//Name
	@FindBy(how=How.CSS ,using="#root > div > section > div.profile-topper > div.profile-cover-photo > div.profile-cover-info > div")
	public WebElement profileName;
	
	//post locators
	//post input
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[3]/div/div[1]/form/div[1]/textarea")
	public WebElement postInput;
	
	//post submit
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[3]/div/div[1]/form/div[2]/button")
	public WebElement postSubmit;
	
	//post photo button 
	@FindBy(how=How.ID ,using="post-pic-input")
	public WebElement postPic;
	
	@FindBy(how=How.XPATH ,using="//*[@id=\"root\"]/div/section/div[3]/div/div[2]/div[1]/div[2]/div/div[1]")
	public WebElement firstPostInFeed;
	
	//first post author
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[3]/div/div[2]/div[1]/div[1]/div[2]/a")
	public WebElement firstPostAuthor;
	
	//tagged user in post
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/a")
	public WebElement firstPostTaggedUser;
	
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
	public WebElement firstPostLastComment;
	
	//author of the last comment made on the first post
	@FindBy(how=How.XPATH ,using="(/html/body/main/div/section/div[3]/div/div[2]/div[2]/div/div/div)[last()-1]/div[2]/div[1]")
	public WebElement firstPostLastCommentAuthor;
	
	//delete the last comment made on the first post in the feed
	@FindBy(how=How.XPATH ,using="(/html/body/main/div/section/div[3]/div/div[2]/div[2]/div/div/div)[last()-1]/div[3]")
	public WebElement firstPostLastCommentDelete;
	
	//The input field to write a comment on the first post in the feed
	@FindBy(how=How.XPATH ,using="(/html/body/main/div/section/div[3]/div/div[2]/div[2]/div/div/div)[last()]/form/input")
	public WebElement firstPostCommentInput; 

}
