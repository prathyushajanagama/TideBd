package com.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExcelData;

public class Search2 {
	
	
	public static ExcelData excel;

	WebDriver driver;
	public Search2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='q']")
	WebElement srching;
	
	@FindBy(xpath="//*[@id=\"site-content\"]/div[3]/div[2]/div/div/div/div[1]/div/div/div/div[1]/a/picture/img")
	WebElement pros;
	
	
	public void scrhing() {
		excel=new ExcelData();
		
		
		srching.click();
		//srching.sendKeys("Brightness"+Keys.ENTER);
		
		srching.sendKeys(excel.getStringData(0, 1, 0)+Keys.ENTER);
	}
	
	public void items() {
		
		
		pros.click();
	}
}
