package com.automation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashElementExample {
	static WebDriver driver;
	static JavascriptExecutor js ;

	@Test
	public static void Login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\JavaPractice\\All jars\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		js=(JavascriptExecutor)driver;

		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		WebElement searchButton = driver.findElement(By
				.xpath("//input[contains(@name,'q')]"));
		flashElement(searchButton, driver);
	}

	public static void flashElement(WebElement element, WebDriver driver) {
		

		String bckgroundColor = element.getCssValue("backgroundColor");

		for (int i = 0; i < 10; i++) {
			changeBackGroundColor("rgb(0,200,0)", element, driver);

			changeBackGroundColor(bckgroundColor, element, driver);
		}

	}

	public static void changeBackGroundColor(String color, WebElement element,
			WebDriver driver) {
		
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'",element);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
