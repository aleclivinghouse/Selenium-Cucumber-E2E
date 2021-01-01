package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NavLocators {
	
	@FindBy(how=How.XPATH ,using="/html/body/main/div/header/div/div[2]/ul[1]/li[1]/a")
	public WebElement navProfile;

	@FindBy(how=How.XPATH ,using="/html/body/main/div/header/div/div[2]/ul[1]/li[2]/a")
	public WebElement navHome;
	

	@FindBy(how=How.XPATH ,using="/html/body/main/div/header/div/div[2]/ul[2]")
	public WebElement navFriends;
	
	@FindBy(how=How.XPATH ,using="/html/body/main/div/header/div/div[2]/ul[2]/li/div[2]/ul[1]")
	public WebElement navFriendsAccept;
			

	@FindBy(how=How.XPATH ,using="/html/body/main/div/header/div/div[2]/ul[2]/li/div[2]/ul[1]")
	public WebElement navFriendsReject;

	@FindBy(how=How.CSS ,using="#root > div > header > div > div.searchbar-component > form > input[type=text]")
	public WebElement navSearch;
	
	@FindBy(how=How.CSS ,using="#root > div > header > div > div.searchbar-component > form > div")
	public WebElement navSearchResults;
	
	@FindBy(how=How.LINK_TEXT ,using="testuser 1")
	public WebElement navSearchFirst;
	
	@FindBy(how=How.CSS ,using="#root > div > header > div > div.searchbar-component > form > div > ul > li:nth-child(2) > a > div")
	public WebElement navSearchFirstName;
	
	@FindBy(how=How.CSS ,using="#root > div > header > div > div.navigation-component > ul.privacy-icons")
	public WebElement logOut;
}
