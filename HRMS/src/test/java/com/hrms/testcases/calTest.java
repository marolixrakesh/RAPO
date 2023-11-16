package com.hrms.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.pageobjects.Login_Functionality;
import com.pageobjects.cal;

public class calTest extends TestBase{
	

	Login_Functionality lg;
	cal b;
	
	public calTest() {
		super();
	}
	
	
	
	@BeforeMethod
	public void ab() {
		
		Setup();
		lg = new Login_Functionality(driver);
		
		b= new cal(driver);
	}
	
	@Test(priority=1)
	public void verifylogin() {
		
		lg.validateLogin();
		b.bc();
		
		
	}
	
}
