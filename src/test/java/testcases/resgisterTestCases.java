package testcases;

import java.io.IOException;
import java.lang.invoke.ConstantCallSite;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.resources.baseclass;
import com.resources.constants;

import PageObjectModel.HomePageObject;
import PageObjectModel.resgistrationPageObject;
import bsh.org.objectweb.asm.Constants;

public class resgisterTestCases extends baseclass {

	public static String RandomEmail() {
		return System.currentTimeMillis() + "@gmail.com";

	}

	@Test
	public void verifyRegistrationWithValidData() throws IOException, InterruptedException {

		Thread.sleep(5000);

		// initializeDriver();

		// driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		HomePageObject hpo = new HomePageObject(driver);
		hpo.clickonmyaccount().click();
		hpo.clickOnRegister().click();

		resgistrationPageObject rpo = new resgistrationPageObject(driver);

		rpo.enterFirstname().sendKeys(constants.firstname);
		rpo.enterLastname().sendKeys(constants.lastname);
		rpo.enterEmail().sendKeys(RandomEmail());
		rpo.enterTelephone().sendKeys(constants.telephone);
		rpo.enterPassword().sendKeys(constants.password);
		rpo.enterPasswordConfirm().sendKeys(constants.confirmpassword);
		rpo.enterSubscribe().click();
		Thread.sleep(2000);
		rpo.enterPrivacyPolicy().click();
		rpo.clickOnContinue().click();

		SoftAssert sa = new SoftAssert();

		String successurl = constants.successurl;

		sa.assertEquals(driver.getCurrentUrl(), successurl);
		sa.assertAll();

	}

	@Test
	public void verifyRegistrationWithBlankData() {

		HomePageObject hpo = new HomePageObject(driver);
		hpo.clickonmyaccount().click();
		hpo.clickOnRegister().click();

		resgistrationPageObject rpo = new resgistrationPageObject(driver);

		//rpo.enterFirstname().clear();
		rpo.enterFirstname().sendKeys(" ");
		rpo.enterLastname().sendKeys(" ");
		rpo.enterEmail().sendKeys(" ");
		rpo.enterTelephone().sendKeys(" ");
		rpo.enterPassword().sendKeys(" ");
		rpo.enterPasswordConfirm().sendKeys(" ");
		rpo.enterSubscribe().click();
		rpo.enterPrivacyPolicy().click();
		rpo.clickOnContinue().click();

		SoftAssert sa = new SoftAssert();
		String FirstnameErrorMsg = constants.FirstnameErrorMsg;
		String LastnameErrorMsg = constants.LastnameErrorMsg;
		
		sa.assertEquals(rpo.capturefirstnameerrormsg().getText(), FirstnameErrorMsg);
		sa.assertEquals(rpo.capturelastnameerrormsg().getText(), LastnameErrorMsg);
		sa.assertAll();

	}

}
