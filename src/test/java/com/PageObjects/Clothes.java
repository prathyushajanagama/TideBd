package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clothes {

	WebDriver driver;
	public Clothes(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	 
	@FindBy(xpath="//a[@data-action-detail='How to Wash Clothes']")
	WebElement Wash;
	
	@FindBy(linkText="How to remove stains")
	WebElement Stain;
	
   public void Wash() {
		
		 Wash.click();;
	}
	
	
	public void Stain() {
		
		 Stain.click();;
	}
	
	
}
