package com.hrms.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.pageobjects.Login_Functionality;
import com.pageobjects.module2;

public class moduleTest extends TestBase{
	
	       module2 ma;
	       
	        Login_Functionality lg;
	
	     public moduleTest() {
	    	 
	    	 super();
	    	 
	     }
	     
	     @BeforeMethod
	     public  void intialize() {
			
	    	 Setup();
	    	 
	    	 lg=new Login_Functionality(driver);
	    	 
	     }
	     
	     @Test
	     public void verifylogin2() throws Throwable {
	    	 
	    	 lg.validateLogin();
	    	 Thread.sleep(2000);
	    	 ma.validateLogin2();
	    	
	    	 
	     }
	     
	    
}
