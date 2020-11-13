package pages.actions;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.GregorianCalendar;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

import org.junit.Assert;

import pages.locators.ProfileLocators;
import pages.locators.HomeLocators;
import pages.locators.LoginRegisterLocators;
import pages.locators.NavLocators;
import pages.locators.OtherProfileLocators;
import utils.SeleniumDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ProfileWallActions {
	
	String newBirthday = null;
	String newRelationshipStatus = null;
	String newSchool = null;
	String newWork = null;
	String newCurrentTown = null;
	String textPostWall = null;
	String textPostProfile = null;
	String textImagePostProfile = null;
	String textImagePostWall = null;
	int  likeWall = 0;
	int likeProfile = 0;
	String commentWall = null;
	String commentProfile = null;
	String deleteCommentWall = null;
	String deleteCommentProfile = null;
	String otherUserLikeWall = null;
	String otherUserLikeProfile = null;
	String otherUserCommentWall = null;
	String searchName = null;
	
	HomeLocators homeLocators = null;
	ProfileLocators profileLocators = null;
	OtherProfileLocators otherProfileLocators = null;
	NavLocators navLocators = null;
	
//try using javascript executer
	public ProfileWallActions(){
		this.homeLocators = new HomeLocators();
		this.navLocators = new NavLocators();
		this.profileLocators = new ProfileLocators();
		this.otherProfileLocators = new OtherProfileLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),homeLocators);
		PageFactory.initElements(SeleniumDriver.getDriver(),profileLocators);
		PageFactory.initElements(SeleniumDriver.getDriver(),otherProfileLocators);
		PageFactory.initElements(SeleniumDriver.getDriver(),navLocators);
	}
	
	JavascriptExecutor js = (JavascriptExecutor)SeleniumDriver.getDriver();
	Actions actions = new Actions(SeleniumDriver.getDriver());
	
	//I click on my name in the nav
	public void clickOnNameInNav() {
		navLocators.navProfile.click();
	}
	//I am redirected to my profile page
	public void redirectedToProfilePage() throws InterruptedException {
		Thread.sleep(1000);
		String actualText = profileLocators.uploadCoverPhotoText.getText();
		String expectedText = "Upload Cover Photo";
		Assert.assertEquals(actualText, expectedText);
	}
	
	//I change my birthday
	public void changeBirthday() {
		String dateString = randomDate();
		newBirthday += dateString;
		System.out.println("changeBirthday " + newBirthday);
		profileLocators.changeBirthDay.clear();
		System.out.println("value should be cleared" + profileLocators.changeBirthDay.getAttribute("value"));
		profileLocators.changeBirthDay.sendKeys(dateString);
		profileLocators.aboutUserSubmit.click();
	}
	
	public void newBirthdayOnScreen() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("newBirthday " + newBirthday);
		String actualText = profileLocators.changeBirthDay.getAttribute("value");
		System.out.println("actualValueNewBirthday" + actualText);
		String expectedText = newBirthday;
		Assert.assertEquals(actualText, expectedText);
	}
	
	public void changeRelationshipStatus(){
		String random = UUID.randomUUID().toString();
		String randomShortened = random.substring(random.length() - 10);
		newRelationshipStatus = randomShortened;
		profileLocators.changeRelationShipStatus.clear();
		profileLocators.changeRelationShipStatus.sendKeys(randomShortened);
		profileLocators.aboutUserSubmit.click();
	}
	
	public void newRelationShipStatusOnScreen() throws InterruptedException {
		Thread.sleep(1000);
		String actualText = profileLocators.changeRelationShipStatus.getAttribute("value");
		String expectedText = newRelationshipStatus;
		Assert.assertEquals(actualText, expectedText);
	}
	
	public void changeSchool(){
		String random = UUID.randomUUID().toString();
		String randomShortened = random.substring(random.length() - 10);
		newSchool = randomShortened;
		profileLocators.changeSchool.clear();
		profileLocators.changeSchool.sendKeys(randomShortened);
		profileLocators.aboutUserSubmit.click();
	}
	
	public void newSchoolOnScreen() throws InterruptedException {
		Thread.sleep(1000);
		String actualText = profileLocators.changeSchool.getAttribute("value");
		String expectedText = newSchool;
		Assert.assertEquals(actualText, expectedText);
	}
	
	public void searchUser(String searchInput) throws InterruptedException {
		navLocators.navSearch.clear();
		navLocators.navSearch.sendKeys(searchInput);
		actions.moveToElement(navLocators.navSearchResults).build().perform();
		Thread.sleep(3000);
		searchName = navLocators.navSearchFirstName.getText();
		System.out.println("this is the search name in searchUser" + searchName);
		js.executeScript("arguments[0].click()", navLocators.navSearchFirst);
	}
	
	public void onSearchedUsersProfile() throws InterruptedException {
		Thread.sleep(3000);
		boolean flag = true;
		System.out.println("this is the actual profile name in onSearchedUsersProfile" + otherProfileLocators.profileName.getText());
		System.out.println("this is the expected profile name in onSearchedUsersProfile" + searchName);
		searchName = searchName.toLowerCase();
		String actualName = otherProfileLocators.profileName.getText().toLowerCase();
		if(!searchName.equals(actualName)){
			flag = false;
		}
		Assert.assertTrue(flag);
	}
	
	public void postOnHisFeed() throws InterruptedException {
		String random = UUID.randomUUID().toString();
		String randomShortened = random.substring(random.length() - 10);
		textPostProfile = randomShortened;
		System.out.println("this is textPostProfile after being assigned: " + textPostProfile);
		profileLocators.postTextArea.clear();
		profileLocators.postTextArea.sendKeys(randomShortened);
		profileLocators.postSubmit.click();
	}
	
	
	public void LogOut() {
		navLocators.logOut.click();
	}
	
	public void changeWork(){
		String random = UUID.randomUUID().toString();
		String randomShortened = random.substring(random.length() - 10);
		newWork = randomShortened;
		profileLocators.changeWork.clear();
		profileLocators.changeWork.sendKeys(randomShortened);
		profileLocators.aboutUserSubmit.click();
	}
	
	public void newWorkOnScreen() throws InterruptedException {
		Thread.sleep(1000);
		String actualText = profileLocators.changeWork.getAttribute("value");
		String expectedText = newWork;
		Assert.assertEquals(actualText, expectedText);
	}
	
	public void changeCity(){
		String random = UUID.randomUUID().toString();
		String randomShortened = random.substring(random.length() - 10);
		newCurrentTown = randomShortened;
		System.out.println("this is changeCity newCurrentTown: " + newCurrentTown);
		profileLocators.changeCurrentTown.clear();
		profileLocators.changeCurrentTown.sendKeys(randomShortened);
		profileLocators.aboutUserSubmit.click();
	}
	
	public void newCityOnScreen() throws InterruptedException {
		Thread.sleep(1000);
		String actualText = profileLocators.changeCurrentTown.getAttribute("value");
		System.out.println("this is newCityOnSCreen actualText: " + actualText);
		String expectedText = newCurrentTown;
		System.out.println("this is newCityOnSCreen expectedText: " + expectedText);
		Assert.assertEquals(actualText, expectedText);
	}
	
	public void postJustTextProfile() {
		String random = UUID.randomUUID().toString();
		String randomShortened = random.substring(random.length() - 10);
		textPostProfile = randomShortened;
		System.out.println("this is textPostProfile after being assigned: " + textPostProfile);
		profileLocators.postTextArea.clear();
		profileLocators.postTextArea.sendKeys(randomShortened);
		profileLocators.postSubmit.click();
	}
	
	public void newPostShowsOnWallAndProfile() throws InterruptedException {
		navLocators.navProfile.click();
		Thread.sleep(3000);
		boolean flag = true;
		String expectedText = textPostProfile;
		System.out.println("this is textPostProfile in newPostShowsOnWallAndProfile: " + expectedText);
		System.out.println("this is expectedText after being assigned: " + expectedText);
		System.out.println("this is expected text: " + expectedText);
		String profileActualText = profileLocators.firstPostInFeed.getText();
		System.out.println("this is profile actual text: " + profileActualText);
		 if(!profileActualText.equals(expectedText)) {
			  flag = false;
		  }
		//now we have to actually
		navLocators.navHome.click();
		Thread.sleep(3000);
		String wallActualText = homeLocators.FirstPostText.getText();
		System.out.println("this is wall actual text: " + wallActualText);
	    if(!wallActualText.equals(expectedText)) {
			  flag = false;
		  }
		Assert.assertTrue(flag);
	}
	
	public void postCommentProfile() throws InterruptedException {
		js.executeScript("window.scrollBy(0,450)", "");
		String random = UUID.randomUUID().toString();
		String randomShortened = random.substring(random.length() - 10);
		commentProfile = randomShortened;
		System.out.println("commentProfile in post: " + commentProfile);
		profileLocators.firstPostCommentInput.clear();
		profileLocators.firstPostCommentInput.sendKeys(randomShortened);
		profileLocators.firstPostCommentInput.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}
	
	public void newCommentShowsOnWallAndProfile() throws InterruptedException {
		navLocators.navProfile.click();
		js.executeScript("window.scrollBy(0,450)", "");
//		  new WebDriverWait(SeleniumDriver.getDriver(), 60)
//          .until(ExpectedConditions.visibilityOf(profileLocators.firstPostLastComment));
		boolean flag = true;
		System.out.println("commentProfile in view: " + commentProfile);
		String expectedText = commentProfile;
		System.out.println("this is expected text in newCommentShows" + expectedText);
		String profileActualText = profileLocators.firstPostLastComment.getText();
		System.out.println("this is profile actual text in newCommentShows" + profileActualText);
		 if(!profileActualText.equals(expectedText)) {
			  flag = false;
			  System.out.println("flag false fired");
		  }
		//now we have to actually
		navLocators.navHome.click();
		js.executeScript("window.scrollBy(0,450)", "");
//		  new WebDriverWait(SeleniumDriver.getDriver(), 60)
//          .until(ExpectedConditions.visibilityOf(homeLocators.firstPostLastComment));
		String wallActualText = homeLocators.firstPostLastComment.getText();
		System.out.println("this is wall actual text in newCommentShows" + wallActualText);
	    if(!wallActualText.equals(expectedText)) {
			  flag = false;
		  }
	    Thread.sleep(2000);
		Assert.assertTrue(flag);
	}
	
	
	public void likeFirstPostOnProfile(){
		likeProfile = 0;
		js.executeScript("window.scrollBy(0,100)", "");
		profileLocators.likeFirstPostInFeed.click();
		likeProfile +=1;
	}
//	
	public void firstPostLikeShowsOnWallAndProfile() throws InterruptedException {
		navLocators.navProfile.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,100)", "");
		String likeCountProfile = profileLocators.firstPostInFeedLikeCount.getText();
		likeCountProfile = likeCountProfile.replaceAll("[^\\d.]", "");
		likeCountProfile = likeCountProfile.trim();
		System.out.println("this is like count profile in likeShows " + likeCountProfile);
		
		navLocators.navHome.click();
		Thread.sleep(3000);
		String likeCountWall = homeLocators.firstPostLikeCount.getText();
		likeCountWall = likeCountWall.replaceAll("[^\\d.]", "");
		likeCountWall = likeCountWall.trim();
		System.out.println("this is like count wall in likeShows" + likeCountWall);
		boolean flag = true;
		int likeCountProfileNum = Integer.parseInt(likeCountProfile);
		System.out.println("this is like count profile num in likeShows" + likeCountProfileNum);
		int likeCountWallNum = Integer.parseInt(likeCountWall);
		if(likeCountProfileNum != likeProfile) {
			flag = false;
		}

		Thread.sleep(1000);
		if(likeCountWallNum != likeProfile) {
			flag = false;
		}
		Assert.assertTrue(flag);
	}
	
	public void deleteCommentProfile(){
		js.executeScript("window.scrollBy(0,200)", "");
		profileLocators.deleteComment.click();
	}
	
	public void commentIsDeletedOnWallAndProfile() throws InterruptedException {
		navLocators.navProfile.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)", "");
		boolean flag = false;
		boolean profileDisplayed = true;
		boolean wallDisplayed = true;
		String profileActualText = null;
		String wallActualText = null;
		
		if(Exists(profileLocators.firstPostLastComment)) {
			profileDisplayed = false;
			flag = true;
		} else {
			profileActualText = profileLocators.firstPostLastComment.getText();
		}
		
		navLocators.navHome.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)", "");
		if(Exists(profileLocators.firstPostLastComment)) {
			wallDisplayed = false;
			flag = true;
		} else {
			wallActualText = homeLocators.firstPostLastComment.getText();
		}
		while(profileDisplayed == true && wallDisplayed == true) {
			if(!wallActualText.equals(commentProfile) || profileActualText.equals(commentProfile)){
				flag = true;
			}
		}

		Assert.assertTrue(flag);
	}
	
	public void editCommentProfile() {
		Select dropdown = new Select(profileLocators.editDeletePostDropdown);
		dropdown.selectByVisibleText("Edit");
	}
	
	public void postFromRandomUserAppears(){
		String random = UUID.randomUUID().toString();
		String randomShortened = random.substring(random.length() - 10);
		textPostProfile = randomShortened;
		System.out.println("this is textPostProfile after being assigned: " + textPostProfile);
		profileLocators.postTextArea.clear();
		profileLocators.postTextArea.sendKeys(randomShortened);
		profileLocators.postSubmit.click();
	}
	
	
	
	
	//utils
	
    public  boolean Exists(WebElement element){
        if (element == null)
        { return false; }
        return true;
    }
    
	public String randomDate(){
		GregorianCalendar gc = new GregorianCalendar();
	    String dateStr = "";
	    int year = randBetween(1955, 2000);
	    gc.set(gc.YEAR, year);
	    int dayOfYear = randBetween(1, 28);
	    int dayOfMonth = randBetween(1, 12);
	    gc.set(gc.DAY_OF_YEAR, dayOfYear);
	    gc.set(gc.DAY_OF_MONTH, dayOfMonth);
	    String yearString = Integer.toString(year);
	    String dayString = Integer.toString(dayOfYear);
	    String monthString = Integer.toString(dayOfMonth);
	    String zeroString = "0";  
	    if(monthString.length() < 2){
	         monthString = zeroString.concat(monthString);
	     }
	     if(dayString.length() < 2){
	         dayString = zeroString.concat(dayString);
	     }
	     dateStr = yearString + "-" + monthString + "-" + dayString;
	     System.out.println("randomDate return " + dateStr);
	     return dateStr;
   }
	
    public int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
	
}
