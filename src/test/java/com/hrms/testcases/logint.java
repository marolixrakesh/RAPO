package com.hrms.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logint {

	public static void main(String[] args) {

     WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
     driver.get("http://hr.marolix.com/login");
     
     
     driver.findElement(By.id("email")).sendKeys("sampath.marolix@gmail.com");
     driver.findElement(By.id("password")).sendKeys("Sampath@247");
     
     driver.findElement(By.id("login_button")).click();
     
     driver.findElement(By.xpath("//span[text()='Hi, Sampath Kumar!']")).sendKeys("Updated the project");
	}

}
