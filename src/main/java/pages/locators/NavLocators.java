package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NavLocators {
	
	//navProfile
	@FindBy(how=How.XPATH ,using="/html/body/main/div/header/div/div[2]/ul[1]/li[1]/a")
	public WebElement navProfile;
	
	//nav Home
	@FindBy(how=How.XPATH ,using="/html/body/main/div/header/div/div[2]/ul[1]/li[2]/a")
	public WebElement navHome;
	
	//nav friends
	@FindBy(how=How.XPATH ,using="/html/body/main/div/header/div/div[2]/ul[2]")
	public WebElement navFriends;
	
	//nav friends accept
	@FindBy(how=How.XPATH ,using="/html/body/main/div/header/div/div[2]/ul[2]/li/div[2]/ul[1]")
	public WebElement navFriendsAccept;
			
	//nav friends decline
	@FindBy(how=How.XPATH ,using="/html/body/main/div/header/div/div[2]/ul[2]/li/div[2]/ul[1]")
	public WebElement navFriendsReject;

}
