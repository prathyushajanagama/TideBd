package com.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExcelData;

public class Search {
	
	
	public static ExcelData excel;

	WebDriver driver;
	public Search(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='q']")
	WebElement srch;
	
	@FindBy(xpath="//*[@id=\"site-content\"]/div[3]/div[2]/div/div/div/div[1]/div/div[1]/div/div[1]/a/picture/img")
	WebElement item;
	
	
	public void scrh() {
		excel=new ExcelData();
		
		srch.click();
		//srch.sendKeys("Odor removal"+Keys.ENTER);
		
		srch.sendKeys(excel.getStringData(0, 0, 0)+Keys.ENTER);
		
		
	}
	
	
	public void item() {
		
		
		item.click();
	}
	
}
