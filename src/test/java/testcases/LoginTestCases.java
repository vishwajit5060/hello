package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.resources.baseclass;
import com.resources.constants;

import PageObjectModel.HomePageObject;
import PageObjectModel.LoginPageObject;

public class LoginTestCases extends baseclass {
	
	public static String RandomEmail="";
	

	@Test
	public void validLoginTest() throws IOException {
		//initializeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		HomePageObject hpo=new HomePageObject (driver);
		hpo.clickonmyaccount();
		hpo.clickOnLogin();
		
		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.enteremail().sendKeys(resgisterTestCases.RandomEmail());
		lpo.enterpassword().sendKeys(constants.password);
		lpo.clickonlogin().click();
	}

}
