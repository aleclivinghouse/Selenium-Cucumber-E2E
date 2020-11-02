package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginRegisterLocators {
	
	//Login locators
	@FindBy(how=How.XPATH,using="//*[@id=\"email\"]")
	public WebElement logInEmail;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"password\"]")
	public WebElement logInPassword;
	
	@FindBy(how=How.LINK_TEXT,using="Log in")
	public WebElement logInSubmit;
	
	//Register locators
	@FindBy(how=How.NAME ,using="firstname")
	public WebElement registerFirstName;
	
	@FindBy(how=How.NAME ,using="lastname")
	public WebElement registerLastName;
	
	@FindBy(how=How.XPATH ,using="//*[@id=\"root\"]/div/section/div/section/form/div[1]/div[3]/input")
	public WebElement registerEmail1;
	
	@FindBy(how=How.NAME ,using="secondemail")
	public WebElement registerEmail2;
	
	@FindBy(how=How.XPATH ,using="//*[@id=\"root\"]/div/section/div/section/form/div[1]/div[5]/input")
	public WebElement registerPassword;
	
	@FindBy(how=How.NAME ,using="birthmonth")
	public WebElement registerBirthMonth;
	
	@FindBy(how=How.NAME ,using="birthdate")
	public WebElement registerBirthDate;
	
	@FindBy(how=How.NAME ,using="birthyear")
	public WebElement registerBirthYear;
	
	@FindBy(how=How.XPATH ,using="//*[@id=\"root\"]/div/section/div/section/form/div[3]/div[1]/label[1]/input")
	public WebElement registerGenderFemale;
	
	@FindBy(how=How.XPATH ,using="//*[@id=\"root\"]/div/section/div/section/form/div[3]/div[1]/label[2]/input")
	public WebElement registerGenderMale;
	
	@FindBy(how=How.XPATH ,using="//*[@id=\"root\"]/div/section/div/section/form/div[4]/div/a/input")
	public WebElement registerSubmit;
	
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div/section/form/div[1]/div[3]/div/i")
	public WebElement emailError;
	
	@FindBy(how=How.XPATH ,using="/html/body/main/div/section/div/section/form/div[1]/div[4]/div/i")
	public WebElement email2Error;
	
}
