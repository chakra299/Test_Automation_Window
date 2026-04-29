package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	// Constructor invoked from basePage
	public HomePage(WebDriver driver) {

		super(driver);
		System.out.println("Driver in HomePage: " +driver);
	}

	// Locator finding based on page object design

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement clckMyaccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement clckRegister;

	// Action methods
	public void clickMyAccount() {

		clckMyaccount.click();

	}

	public void clickRegister() {

		clckRegister.click();
	}

}
