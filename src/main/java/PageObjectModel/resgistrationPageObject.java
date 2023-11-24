package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class resgistrationPageObject {
	
	public WebDriver driver;
	
	private By firstname= By.xpath("//input[@name='firstname']");
	private By lastname= By.xpath("//input[@name='lastname']");
	private By email=By.xpath("//input[@name='email']");
	private By telephone=By.xpath("//input[@type='tel']");
	private By password= By.xpath("//input[@type='password']");
	private By passwordconfirm=By.xpath("//input[@name='confirm']");
	private By subscribe=By.xpath("//input[@name='newsletter']");
	private By privacypolicy=By.xpath("//input[@type='checkbox']");
	private By continuebutton=By.xpath("//input[@type='submit']");
	
	private By firstnameErrorMsg= By.xpath("//div[@class='text-danger'] [1]");
	private By lastnameErrorMsg=By.xpath("//div[@class='text-danger'][2]");
	
	public resgistrationPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement enterFirstname() {
		return driver.findElement(firstname);
	}
	public WebElement enterLastname() {
		return driver.findElement(lastname);
	}	
	public WebElement enterEmail() {
		return driver.findElement(email);
	}
	public WebElement enterTelephone() {
		return driver.findElement(telephone);
	}
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	public WebElement enterPasswordConfirm() {
		return driver.findElement(passwordconfirm);
	}
	public WebElement enterSubscribe() {
		return driver.findElement(subscribe);
	}
	public WebElement enterPrivacyPolicy() {
		return driver.findElement(privacypolicy);
	}
	public WebElement clickOnContinue() {
		return driver.findElement(continuebutton);
	}
	public WebElement capturefirstnameerrormsg() {
		return driver.findElement(firstnameErrorMsg);
	}
	public WebElement capturelastnameerrormsg() {
		return driver.findElement(lastnameErrorMsg);
	}
	
	}	

