package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AlertHandlingDemo {
	
	
	@Test
	public void acceptAlert(){
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert2");
		
		// Now Before Clicking on Try it button First we have to switch to Fame becoz this button is inside the Iframe 
		
		try{
		driver.switchTo().frame(0);
		
		}
		catch(NoSuchFrameException e){
			System.out.println("Frame is Not available");
		}
		//Now click on Try It Button
		
		driver.findElement(By.xpath("html/body/button")).click();
		
		driver.switchTo().alert().accept();
		
		
		
	}
}
