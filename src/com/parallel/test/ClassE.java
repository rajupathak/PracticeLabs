package com.parallel.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassE {
	@Test
	  public void E() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

			driver.get("https://www.facebook.com/");
			Thread.sleep(1000);
			System.out.println("Class E Is closed");
			driver.quit();
	  }
}
