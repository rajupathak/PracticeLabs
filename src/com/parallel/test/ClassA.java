package com.parallel.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassA {
  @Test
  public void A() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		System.out.println("Class A Is closed");
		driver.quit();
  }
}
