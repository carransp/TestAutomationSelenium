package com.qa.testscripts;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_OrangeHRM_002 {
	
	/*
	 Test Scenario:
	 --------------------------------------
	 1. Open the browser
	 2. Enter the OrangeHRM URL
	 3. Select Admin from the Tabs
	 4. Select Organization
	 5. Select Locations from the dropdown
	 6. Click 'add' 
	 8. Close the browser
	 */
	
	
	// public static void main(String[] args) throws InterruptedException {
		
		// Open the browser
	
	@Test
		public void searchItem() throws InterruptedException {
			

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("OrangeHRM")) {
			//System.out.println("OrangeHRM page is loaded");
			Reporter.log("OrangeHRM page is loaded");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(5000);
		//System.out.println(driver.getPageSource()); // HTML page sources
		
		System.out.println(driver.getWindowHandle()); // window id of the browser instance.
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		 
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();   
		driver.findElement(By.id("menu_admin_Organization")).click();  
		driver.findElement(By.id("menu_admin_viewLocations")).click();  
		 
		driver.findElement(By.id("btnAdd")).click();
			
		//driver.getWindowHandles(); // window ids of all the browser tab & window at the run session
//		driver.findElement("locator"); // reach the web element present on page using the locator
//		driver.findElements("locator"); // reach the group of element matching a locator
		
		//driver.switchTo().window(""); // switch to a window / tab based on window id
		//driver.switchTo().frame("");  // switch to a frame with the id /name / webelement
		//driver.switchTo().alert(); // switch to alert window
		
		//driver.navigate().to("https://www.google.co.in/");
		//Thread.sleep(5000);
		//driver.navigate().back();
		//Thread.sleep(5000);		
		//driver.navigate().forward();
		//Thread.sleep(5000);
		
	driver.close(); // current browser instance will be closed
	//	driver.quit(); // close all the browser instance , tab / window
	}

}
