package com.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class baseclass {
	public WebDriver driver;

	public void initializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"/src/main/java/com/resources/data.properties");
		Properties prop = new Properties();

		prop.load(fis);

		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new ChromeDriver();
		}

	}
	@BeforeClass
	public void launchBrowswer() throws IOException {
		initializeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");		
	}
	
}
