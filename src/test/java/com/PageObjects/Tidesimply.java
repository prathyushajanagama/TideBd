package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tidesimply {
	
	WebDriver driver;
	public Tidesimply(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//*[@id=\"site-footer\"]/div[2]/div/div[1]/div/div[4]/div/div[2]/div[4]/a/span")
	WebElement Tidesimply;
	
	
	public void Tidesimply() {
		 Tidesimply.click();;
	}
	
	
}

