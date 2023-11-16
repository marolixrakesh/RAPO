package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.TestBase;

public class module2 {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='HRM System']")
	WebElement btn2;
	
	
	public module2(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public hm2 validateLogin2() {
		
		btn2.click();
		return new hm2();
		
	}
	
	
	
}
