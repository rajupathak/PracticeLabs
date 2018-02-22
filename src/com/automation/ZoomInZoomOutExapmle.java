package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ZoomInZoomOutExapmle {
@Test
public void zoomInOutTest() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	
	//First Method
	/*driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
	Thread.sleep(2000);
	
	driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,"0"));
	*/
	
	//Second Method
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.body.style.zoom='40%'");
	
	Thread.sleep(3000);
	
	js.executeScript("document.body.style.zoom='100%'");
	
	
}
}
