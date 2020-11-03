package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.UUID;
import org.junit.Assert;


import pages.locators.LoginRegisterLocators;
import pages.locators.NavLocators;
import utils.SeleniumDriver;

public class LoginActions {
	LoginRegisterLocators logInRegisterLocators = null;
	NavLocators navLocators = null;
	
	public LoginActions() {
		this.logInRegisterLocators = new LoginRegisterLocators();
		this.navLocators = new NavLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),logInRegisterLocators);
		PageFactory.initElements(SeleniumDriver.getDriver(),navLocators);
	}
	
	public void LoginInWithRandomPassword() {
		String random = UUID.randomUUID().toString();
		logInRegisterLocators.logInEmail.clear();
		logInRegisterLocators.logInEmail.sendKeys(random);
	}
	
	public void LoginInWithRandomEmail() {
		String random = UUID.randomUUID().toString();
		String emailEnd = "@gmail.com";
		String randomEmail = random.concat(emailEnd);
		logInRegisterLocators.logInPassword.clear();
		logInRegisterLocators.logInPassword.sendKeys(randomEmail);
	}
	
	public void PressSignIn() {
		logInRegisterLocators.logInSubmit.click();
	}
	
	public void UserIsSignedIn() throws InterruptedException {
		Thread.sleep(1000);
		String actualText = navLocators.navHome.getText();
		String expectedText = "Home";
		Assert.assertEquals(actualText, expectedText);
	}
	
	public void UserIsNotSignedIn() throws InterruptedException {
		Thread.sleep(1000);
		String actualText = logInRegisterLocators.landingLogo.getText();
		String expectedText = "♠acebook";
		Assert.assertEquals(actualText, expectedText);
	}
	
	public void WrongPassword(){
		logInRegisterLocators.logInPassword.clear();
		logInRegisterLocators.logInPassword.sendKeys("wrongpassword");
	}
	
	public void LoginInWithRightEmail(){
		logInRegisterLocators.logInEmail.clear();
		logInRegisterLocators.logInEmail.sendKeys("testuser1@livinghouse.com");
	}
	
	public void LoginInWithRightPassword(){
		logInRegisterLocators.logInPassword.clear();
		logInRegisterLocators.logInPassword.sendKeys("password");
	}

	
}
