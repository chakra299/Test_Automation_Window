package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC01_AccountRegistrationTest extends BaseClass {

	@Test
	public void verify_account_registration() {

		HomePage homep = new HomePage(driver);
		homep.clickMyAccount();
		homep.clickRegister();

		AccountRegistrationPage arPage = new AccountRegistrationPage(driver);
		arPage.setFirstName(randomeString().toUpperCase());
		arPage.setLastName(randomeString().toUpperCase());
		arPage.setEmail(randomeString() + "@gmail.com");
		arPage.setTelephone(randomeNumber());

		String password = randomeAlphaNuberic();

		arPage.setPassword(password);
		arPage.setConfirmPassword(password);
		arPage.checkPrivatePolicy();
		arPage.clickContinue();
		String confmsg = arPage.getConfirmationMsg();

		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
	}
}
