package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.UUID;
import org.junit.Assert;


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
	
	public void EnterCorrectEmailInReenterEmail() {
		logInRegisterLocators.registerEmail2.clear();
		logInRegisterLocators.registerEmail2.sendKeys(firstEmail);
	
	}
	
	public void EnterInCorrectEmailInReenterEmail() {
		String random = UUID.randomUUID().toString();
		String emailEnd = "@gmail.com";
		String randomShortened = random.substring(random.length() - 10);
		String randomEmail = randomShortened.concat(emailEnd);
		firstEmail = randomEmail;
		logInRegisterLocators.registerEmail2.clear();
		logInRegisterLocators.registerEmail2.sendKeys(randomEmail);
	}
	
	public void LoginInWithRandomPassword() {
		String random = UUID.randomUUID().toString();
		String emailEnd = "@gmail.com";
		String randomEmail = random.concat(emailEnd);
		logInRegisterLocators.registerPassword.clear();
		logInRegisterLocators.registerPassword.sendKeys(randomEmail);
	}
	
}
