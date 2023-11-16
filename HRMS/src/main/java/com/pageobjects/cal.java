package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.TestBase;

public class cal extends TestBase{
	
	WebDriver driver;
	
	
	@FindBy(xpath="//select[@id=\"calender_type\"]")
	
	WebElement cal;
	
	
	
	
	public cal(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void  bc() {
		
		cal.click();
		
		
	}

}
