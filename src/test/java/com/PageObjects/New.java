package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New {

	WebDriver driver;
	public New(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"site-footer\"]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[7]/a/span")
	WebElement Fabriccare;
	
	
	public void Fabriccare() {
		
		Fabriccare.click();
	}
	
}
