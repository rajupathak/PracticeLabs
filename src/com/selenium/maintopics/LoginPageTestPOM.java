package com.selenium.maintopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTestPOM {

	WebDriver driver;
	
@BeforeTest
	
	public void startTheBrowser(){
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
		
	}
	
	@Test
	public void completeRegistration(){
	WebElement firstName=LoginPageLocatorPOM.getPageElement(driver).getFirstName();
	firstName.sendKeys("Rajesh");
	
	WebElement lastName=LoginPageLocatorPOM.getPageElement(driver).getLastName();
	lastName.sendKeys("Pathak");
	
	WebElement emailAddress=LoginPageLocatorPOM.getPageElement(driver).getGmailAddress();
	emailAddress.sendKeys("rajupthk@gmail.com");
	
	}
	
	
	
}
