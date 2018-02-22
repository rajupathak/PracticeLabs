package com.selenium.maintopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkPageTestPOM {

	LinkPageElementPOM object;
	WebDriver driver;
	 
	String expectedTest="Elements";
	@BeforeTest
	
	public void startTheBrowser(){
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/");
		
	}
	
	@Test
	public void verifyTest(){
		object= new LinkPageElementPOM(driver);
		object.clickOnEachLink();
		
	}
	
	
}
