package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends Page{

	@FindBy(xpath = "//span[text() = 'Hello, rajendra']")
	WebElement profileName;
	@FindBy(xpath = "//span[text() = 'Sign Out']")
	WebElement signOut;
	public ProfilePage(WebDriver driver) {
		super(driver);
	}
	public HomePage signOut() {
		Actions action = new Actions(driver);
		action.moveToElement(profileName).build().perform();
		signOut.click();
		return new HomePage(driver);
	}
}
