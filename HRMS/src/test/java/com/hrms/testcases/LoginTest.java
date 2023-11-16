                                                                                                                                                                    package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.Utils.data;
import com.pageobjects.Login_Functionality;

public class LoginTest extends TestBase{
	
	
Login_Functionality lg;
String sheetname = "login";
	
	public LoginTest() {
		
		super();
		
		
	}
	
	@DataProvider
	public String[] [] exl() throws Throwable {
		
		
		
		return data.setdata(sheetname);
	}
	
	@BeforeMethod
	public void intialize() {
		
		Setup();
	
		lg = new Login_Functionality(driver);
		
	}
	
	@Test(dataProvider = "exl", dataProviderClass = LoginTest.class)
	public void cd(String username, String password) {
		
		lg.validateLogin(username, password);
	     String title= driver.getTitle();
		Assert.assertEquals("Marolix HR -     Dashboard", title);
		
	}
	
//	@Test(priority=1)
//	public void verifylogin() {
//		
//		lg.validateLogin();
//		
//	}
//	
//	@Test
//	public void verifytitle() {
//		
//		lg.validateLogin();
//		String title=driver.getTitle();
//		Assert.assertEquals("Marolix HR - Dashboard", title);
//		
//	}
	
	

	
}
