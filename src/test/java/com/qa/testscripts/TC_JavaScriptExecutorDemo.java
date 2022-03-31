package com.qa.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_JavaScriptExecutorDemo extends TestBase {
	
	@Test
	public void sampleJavaScript() throws InterruptedException {
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		for(int i=0;i<5; i++) {
			Js.executeScript("window.scrollBy(0,500)"); //top to down
			Thread.sleep(3000);
		}
			
		for(int i=5;i>1; i--) {
				Js.executeScript("window.scrollBy(0,-500)"); //Bottom to top
				Thread.sleep(3000);
				
		}
		
		    //Horizontal scroll bar
			Js.executeScript("window.scrollBy(500,0)"); //scroll bar will move to left to right
			Js.executeScript("window.scrollBy(-500,0)"); //scroll bar will move to right to left
		
   }
	@Test
	public void ScrollElePresence() {
		
		WebElement ele = AmazonOR.getAmazonCareersLink();
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		Js.executeScript("arguments(0).scrollIntoView", ele);
		
		ele.click();
	}
}
