package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.TestBase;

public class Login_Functionality extends TestBase{
	
	WebDriver driver;
	
	@FindBy(xpath="//a[.='Login']")
	
	WebElement lg;
	
	@FindBy(id="email")
	
	WebElement em;
	
	@FindBy(id="password")
	
	WebElement pass;
	
	
	@FindBy(id="login_button")

	WebElement btn;
	
@FindBy(xpath="//span[.='HRM System']")
	
	WebElement clk;
	
	
	
	public Login_Functionality(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
	
	}
	
	   public HomePage validateLogin(String username, String password) {
		   
		    lg.click();
//		    em.sendKeys(props.getProperty("username"));
//		    pass.sendKeys(props.getProperty("password"));
		    em.sendKeys(username);
		    pass.sendKeys(password);
		    
		    btn.click();
		   
		
		   
		   return new HomePage();
		   
	   }

	   	
}
