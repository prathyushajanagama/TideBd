package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {

	WebDriver driver;
	public Contact(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText="Contact Us")
	WebElement con;
	
	@FindBy(xpath="//*[@id=\"j_id0:j_id1:j_id2:idForm:j_id36:j_id37:opMainId:2:j_id47\"]/img")
	WebElement call;
	
	
	public void con() {
		
		con.click();
	}
	
	public void call() {
		
		call.click();
	}
	
}
