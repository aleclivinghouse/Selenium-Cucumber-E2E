package pages.actions;

import java.util.UUID;
import java.util.GregorianCalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import pages.locators.ProfileLocators;
import pages.locators.HomeLocators;
import pages.locators.LoginRegisterLocators;
import pages.locators.NavLocators;
import utils.SeleniumDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class ProfileWallActions {
	
	String newBirthday = null;
	String newRelationshipStatus = null;
	String newSchool = null;
	String newWork = null;
	String newCurrentTown = null;
	
	HomeLocators homeLocators = null;
	ProfileLocators profileLocators = null;
	NavLocators navLocators = null;
	String textPostWall = null;
	String textPostProfile = null;
	String textImagePostProfile = null;
	String textImagePostWall = null;
	String likeWall = null;
	String likeProfile = null;
	String commentWall = null;
	String commentProfile = null;
	String deleteCommentWall = null;
	String deleteCommentProfile = null;
	String otherUserLikeWall = null;
	String otherUserLikeProfile = null;
	String otherUserCommentWall = null;
	
	JavascriptExecutor js = (JavascriptExecutor)SeleniumDriver.getDriver();
	
	public ProfileWallActions(){
		this.homeLocators = new HomeLocators();
		this.navLocators = new NavLocators();
		this.profileLocators = new ProfileLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),homeLocators);
		PageFactory.initElements(SeleniumDriver.getDriver(),profileLocators);
		PageFactory.initElements(SeleniumDriver.getDriver(),navLocators);
	}

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
		profileLocators.changeCurrentTown.clear();
		profileLocators.changeCurrentTown.sendKeys(randomShortened);
		profileLocators.aboutUserSubmit.click();
	}
	
	public void newCityOnScreen() throws InterruptedException {
		Thread.sleep(1000);
		String actualText = profileLocators.changeCurrentTown.getAttribute("value");
		String expectedText = newCurrentTown;
		Assert.assertEquals(actualText, expectedText);
	}
	
	public void postJustText() {
		String random = UUID.randomUUID().toString();
		String randomShortened = random.substring(random.length() - 10);
		textPostWall = randomShortened;
		profileLocators.postTextArea.clear();
		profileLocators.postTextArea.sendKeys(randomShortened);
		profileLocators.postSubmit.click();
	}
	
	public void newPostShowsOnWallAndProfile() throws InterruptedException {
		navLocators.navProfile.click();
		Thread.sleep(1000);
		String flag = "false";
		String expectedText = textPostWall;
		String profileActualText = profileLocators.firstPostInFeed.getText();
		 if(profileActualText == expectedText) {
			  flag = "true";
		  }
		//now we have to actually
		navLocators.navHome.click();
		Thread.sleep(1000);
		String wallActualText = homeLocators.FirstPostText.getText();
	    if(wallActualText == expectedText) {
			  flag = "true";
		  }
		Assert.assertEquals(flag, "false");
	}
	
	
	//utils
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
