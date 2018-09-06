package com.datepicker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class testDatePicker {

	WebDriver driver;
	
	@BeforeClass
	public void setProperties() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\TestAutomation\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Test(description = "launch the site", priority = 1)
	public void launchSite() {
		driver.get("https://reactdatepicker.com");
		Page page = new Page(driver);
		page.datePicker();
	}
}
