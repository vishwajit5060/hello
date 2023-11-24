package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {

	public WebDriver driver;

	private By myaccount = By.xpath("//i[@class='fa fa-user']");
	private By register = By.xpath("//a[contains(text(),'Register')]");
	private By login = By.xpath("//a[contains(text(),'Login')]");

	public HomePageObject(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement clickonmyaccount() {
		return driver.findElement(myaccount);
	}

	public WebElement clickOnRegister() {
		return driver.findElement(register);
	}

	public WebElement clickOnLogin() {
		return driver.findElement(login);
	}

}
