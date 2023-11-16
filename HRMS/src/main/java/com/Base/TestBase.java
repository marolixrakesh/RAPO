package com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static Properties props;
	FileInputStream file; 
	protected WebDriver driver;
	
	public TestBase() {
		
		props= new Properties();
		
		try {
			
			file =new FileInputStream("./src/main/java/com/PropertiesConfig/Propsfile");
		}
		
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			props.load(file);
			
		}
		catch(IOException e) {
			
			e.printStackTrace();
			
		}
	}
	
	public void Setup() {
		
		
		String browsername = props.getProperty("browser");
		if(browsername.equals("chrome")) {
			
			driver = new ChromeDriver();
		}
		
		else if(browsername.equals("firefox")) {
			
			driver = new FirefoxDriver();
		}
		
		else if(browsername.equals("edge")) {
			
			driver = new EdgeDriver();
		}

	driver.manage().window().maximize();
	driver.get(props.getProperty("url"));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    driver.quit();
		
	}
	
	
	

}
