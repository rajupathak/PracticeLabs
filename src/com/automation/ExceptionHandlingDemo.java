package com.automation;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExceptionHandlingDemo {
	WebDriver driver;

	@BeforeTest
	public void openTheBrowser() {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://selenium-vinod.blogspot.in/p/task1.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public boolean objectPresent(WebDriver driver) {
		try {
			driver.findElement(By.linkText("abc")).click();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

	@Test
	public void test(){
		
	}
}
