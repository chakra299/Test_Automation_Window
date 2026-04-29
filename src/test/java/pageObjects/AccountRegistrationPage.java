package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	WebDriver driver;

	// Constructor
	public AccountRegistrationPage(WebDriver driver) {

		super(driver);

	}

	// locator for Registration page

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtPhone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtPasswordConfirm;
	@FindBy(xpath = "//input[@name='agree']")
	WebElement chckPrivacyPlolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	// Action method Page for Registration page locator

	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);

	}

	public void setTelephone(String telephone) {
		txtPhone.sendKeys(telephone);

	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);

	}

	public void setConfirmPassword(String pwd) {
		txtPasswordConfirm.sendKeys(pwd);

	}

	public void checkPrivatePolicy() {
		chckPrivacyPlolicy.click();

	}
	
	public void clickContinue() {
		btnContinue.click();

	}

	public String getConfirmationMsg() {

		try {
			return (msgConfirmation.getText());

		} catch (Exception e) {
			return (e.getMessage());

		}
	}

}
