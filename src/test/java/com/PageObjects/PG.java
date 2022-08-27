package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PG {

	WebDriver driver;
	public PG(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//img[@alt='P&G icon']")
	WebElement icon;
	
	
	public void icon() {
		
		icon.click();
	}
	
	
}
