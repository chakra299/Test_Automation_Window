package zRough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	// Constructor

	LoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	// Locators

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@Placeholder='Password']")
	WebElement password;
	@FindBy(css= "button[type='submit']")
	WebElement signin_Log;

	// Action methods
	public void setUserName(String userid) {
		username.sendKeys(userid);

	}

	public void setUserPWD(String userPWD) {
		password.sendKeys(userPWD);

	}

	public void loginSignIn() {
		signin_Log.click();
		;

	}

}
