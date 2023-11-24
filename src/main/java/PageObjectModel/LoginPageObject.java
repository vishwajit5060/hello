package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	private By email=By.xpath("//input[@type='text']");
	
	private By password=By.xpath("//input[@type='password']");
	
	private By login=By.xpath("//input[@type='submit']");
	
	public LoginPageObject(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement enteremail() {
		return driver.findElement(email);
	}
	public WebElement enterpassword() {
		return driver.findElement(password);
	}
	public WebElement clickonlogin() {
		return driver.findElement(login);
	}

}


