package com.selenium.maintopics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DownCastingInSelenium {
	RemoteWebDriver driver;
	
	@Test
	public void test() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.google.com/gmail/about/");
	    driver.executeScript("scroll(0,1200)");
	  File sourceFile = driver.getScreenshotAs(OutputType.FILE);
	
	  
	 FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir")+"\\Scrennshots1\\overview.png"));
	
	}
}
