package com.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

	WebDriver driver;
	
	static int number = 0;
	@FindBy(xpath = "//*[@id='example-0']/div/div/div/div/div/div/div/div/div[@class = 'react-datepicker__day react-datepicker__day--sat react-datepicker__day--weekend' and text() = '15']")
	WebElement pick;
	String[] pickDate = new String [] {"example-0", "example-1", "example-2", "example-3", "example-4"};
	public Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void datePicker() {
		//while(number < 5) {
		WebElement element = driver.findElement(By.xpath("//*[@id='" + pickDate[0] +"']/div/div/div/div/div/input"));
		element.click();
		number++;
		pick.click();
		//}
	}
}
