package com.selenium.maintopics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WEBELEMENT_COMMANDS {
	@Test
	public void verify() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
		 
	        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	        
	        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
	        
	        WebElement linkLearnMore = driver.findElement(By.xpath("//div[@class='clearfix']//p[@class='why-information']//a"));        
	      
	        //To save the LInk
	        // String hotKeys = Keys.chord(Keys.ALT, Keys.ENTER);  
	        
	        // To open the link in new tab
	       //String hotKeys = Keys.chord(Keys.SHIFT, Keys.ENTER);  
	        
	        //To open in new tab
	        String hotKeys = Keys.chord(Keys.CONTROL, Keys.ENTER); 
	        
	        linkLearnMore.sendKeys(hotKeys);

	}

}
