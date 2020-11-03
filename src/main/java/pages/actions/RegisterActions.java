package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;
import java.util.UUID;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


import pages.locators.LoginRegisterLocators;
import pages.locators.NavLocators;
import utils.SeleniumDriver;

public class RegisterActions {
	LoginRegisterLocators logInRegisterLocators = null;
	NavLocators navLocators = null;
	public String firstEmail = null;
	
	public RegisterActions() {
		this.logInRegisterLocators = new LoginRegisterLocators();
		this.navLocators = new NavLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),logInRegisterLocators);
		PageFactory.initElements(SeleniumDriver.getDriver(),navLocators);
	}
	
	
	public void FirstNameWithRandomString() {
		String random = UUID.randomUUID().toString();
		String randomShortened = random.substring(random.length() - 10);
		logInRegisterLocators.registerFirstName.clear();
		logInRegisterLocators.registerFirstName.sendKeys(randomShortened);
	}
	
	public void LastNameWithRandomString() {
		String random = UUID.randomUUID().toString();
		String randomShortened = random.substring(random.length() - 10);
		logInRegisterLocators.registerLastName.clear();
		logInRegisterLocators.registerLastName.sendKeys(randomShortened);
	}
	

	public void RegisterWithRandomEmail() {
		String random = UUID.randomUUID().toString();
		String emailEnd = "@gmail.com";
		String randomShortened = random.substring(random.length() - 10);
		String randomEmail = randomShortened.concat(emailEnd);
		firstEmail = randomEmail;
		logInRegisterLocators.registerEmail1.clear();
		logInRegisterLocators.registerEmail1.sendKeys(randomEmail);
	
	}
	
	public void RegisterWithEmailAlreadyTaken() {
		firstEmail = "testuser1@livinghouse.com";
		logInRegisterLocators.registerEmail1.clear();
		logInRegisterLocators.registerEmail1.sendKeys(firstEmail);
	
	}
	
	public void EnterCorrectEmailInReenterEmail() {
		logInRegisterLocators.registerEmail2.clear();
		logInRegisterLocators.registerEmail2.sendKeys(firstEmail);
	
	}
	
	public void EnterIncorrectEmailInReenterEmail() {
		String random = UUID.randomUUID().toString();
		String emailEnd = "@gmail.com";
		String randomShortened = random.substring(random.length() - 10);
		String randomEmail = randomShortened.concat(emailEnd);
		firstEmail = randomEmail;
		logInRegisterLocators.registerEmail2.clear();
		logInRegisterLocators.registerEmail2.sendKeys(randomEmail);
	}
	
	public void RegisterWithRandomPassword() {
		String random = UUID.randomUUID().toString();
		String randomShortened = random.substring(random.length() - 10);
		logInRegisterLocators.registerPassword.clear();
		logInRegisterLocators.registerPassword.sendKeys(randomShortened);
	}
	
	public void RegisterWithRandomBirthMonth() {
		String[] monthList = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jun", "Aug", "Sep", "Oct", "Nov", "Dec"};
		Random random = new Random();
		int index = random.nextInt(monthList.length);
		Select selectBirthMonth = new Select(logInRegisterLocators.registerBirthMonth);
		selectBirthMonth.selectByVisibleText(monthList[index]);
	}
	
	public void RegisterWithRandomBirthDate() {
		int random = (int)(Math.random() * 28 + 1);
		String randomString = Integer.toString(random);
		Select selectBirthDate = new Select(logInRegisterLocators.registerBirthDate);
		selectBirthDate.selectByVisibleText(randomString);
	}
	
	public void RegisterWithRandomBirthYear() {
		int random = 1955 + (int)Math.round(Math.random() * (2000 - 1955));
		String randomString = Integer.toString(random);
		Select selectBirthYear = new Select(logInRegisterLocators.registerBirthYear);
		selectBirthYear.selectByVisibleText(randomString);
	}
	
	public void RegisterGender() {
		int random = (int)(Math.random() * 2 + 1);
		if(random == 1) {
			logInRegisterLocators.registerGenderFemale.click();
		} else {
			logInRegisterLocators.registerGenderMale.click();
		}
	}
	
	public void PressSignUp() {
		logInRegisterLocators.registerSubmit.click();
	}
	
	public void errorMessage() throws InterruptedException {
		  Thread.sleep(1000);
		  String flag = "false";
		  String error1Text = logInRegisterLocators.emailError.getText();
		  String error2Text = logInRegisterLocators.emailError.getText();
		  if(error1Text == "warning" && error2Text == "warning") {
			  flag = "true";
		  }
		 Assert.assertEquals(flag, "true");
	}
	
	public void redirectedToHomePage() throws InterruptedException {
		Thread.sleep(1000);
		String actualText = navLocators.navHome.getText();
		String expectedText = "Home";
		Assert.assertEquals(actualText, expectedText);
	}
	
	
}
