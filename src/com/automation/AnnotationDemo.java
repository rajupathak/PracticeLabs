package com.automation;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {
	WebDriver driver;
	@BeforeTest
	public void beforetest() {
		System.out.println("Hi I am Before Test");
		
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");

		driver = new FirefoxDriver();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Hi I am after Test");
		
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = caps.getBrowserName();
		String browserVersion = caps.getVersion();
		System.out.println(browserName);
		System.out.println(browserVersion);
	}

	@Test(priority =1)
	public void testCase1() {
		System.out.println("Hi I am Test Case 1");
	}

	@Test(priority =2)
	public void testCase2() {
		System.out.println("Hi I am Test Case 2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Hi I am before each method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Hi I am after each method");
	}

	@org.testng.annotations.BeforeClass
	public void beforeClass(){
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("After class");
	}
	
	
	
	@BeforeSuite
	
	public void beforeSuite(){
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("After Suite");
		System.out.println(System.getProperty("os.name").toLowerCase());
	}
	
	
	
}
