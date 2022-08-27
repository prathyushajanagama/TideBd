package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bounce {

	WebDriver driver;
	public Bounce(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//img[@alt='Bounce icon']")
	WebElement Bicon;	
		
		
	public void Bicon() {
		
		Bicon.click();
	}	
	
	
	
	
	
}
