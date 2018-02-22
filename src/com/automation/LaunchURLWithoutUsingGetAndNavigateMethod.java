package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURLWithoutUsingGetAndNavigateMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\JavaPractice\\All jars\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "this.document.location=" + "http://gmail.com";
		System.out.println(script);
		
		js.executeScript(script);
		
		
		
	}
}
