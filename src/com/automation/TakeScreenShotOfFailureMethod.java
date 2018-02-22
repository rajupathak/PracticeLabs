package com.automation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TakeScreenShotOfFailureMethod {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
	}

	@Test
	public void verifyTitle() {
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "log in or sign up");
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {

			Calendar cal = Calendar.getInstance();

			SimpleDateFormat formator = new SimpleDateFormat(
					"dd_MM_YYY_hh_mm_ss");

			TakesScreenshot screen = (TakesScreenshot) driver;
			File source = screen.getScreenshotAs(OutputType.FILE);

			String repository = new File(System.getProperty("user.dir"))+"\\src\\com\\automation\\failedScreenshot\\";
			File destination= new File(repository +formator.format(cal.getTime())+".png");
			
			FileUtils.copyFile(source, destination);

		}

	}

}
