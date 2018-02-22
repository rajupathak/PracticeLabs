package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeLab {
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

	@Test(priority = 1)
	public void enterUserName() {
		driver.findElement(By.name("fname")).sendKeys("Rajesh");

	}

	@Test(priority = 2)
	public void verifyTheLastNameBox() {
		boolean isEnabled = driver.findElement(By.name("lname")).isEnabled();

		Assert.assertFalse(isEnabled, "Test Box is Enabled");

	}

	@Test(priority = 3)
	public void getAttribute() {
		String attributeName = driver
				.findElement(
						By.xpath(".//*[@id='post-body-3133029480054464698']/div[1]/form[1]/textarea"))
				.getAttribute("name");

		System.out.println("Attribute Name is ::  " + attributeName);

	}

	
	

	@Test(priority = 4)
	public void readAndWriteValue() {
		String value = driver
				.findElement(
						By.xpath("//*[@id='sel_2']"))
				.getAttribute("value");

		driver.findElement(By.xpath(".//*[@id='sel_3']")).sendKeys(value);
	}
	
	
	
	
	
	
	
	
	
	
}
