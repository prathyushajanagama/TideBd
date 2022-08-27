package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {

	
	WebDriver driver;
	public Products(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@data-action-detail='Shop Products']")
	WebElement Shop;
	
	
	@FindBy(xpath="//*[@id=\"site-content\"]/div/div/div/div/div[4]/div/div/div/div[3]/div/div[1]/a/picture/img")
	WebElement Cleaner;
	
	
	public void Shop() {
		
		Shop.click();
	}
	
	public void Cleaner() {
		
		Cleaner.click();
	}
}
