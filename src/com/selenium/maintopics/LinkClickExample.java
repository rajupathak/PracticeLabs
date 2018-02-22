package com.selenium.maintopics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LinkClickExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/");
		String expectedText = "Elements";
		String actualText = null;

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> links = driver.findElements(By
				.xpath("//div[@id='leftmenuinnerinner']//a"));
		System.out.println(links.size());

		for (int i = 2; i < links.size(); i++) {
			links.get(i).click();
			try {
				WebElement element = driver.findElement(By
						.xpath(".//*[@id='main']/h1/span"));
				actualText = element.getText();
				System.out.println(actualText);
				
			} catch (NoSuchElementException e) {
				System.out.println(e);
			}
			if (actualText.equalsIgnoreCase(expectedText)) {
				Assert.assertEquals(actualText, expectedText);
				break;
			}
			else{
				driver.navigate().back();

				links = driver.findElements(By
						.xpath("//div[@id='leftmenuinnerinner']//a"));

			}
			
		}

	}
}
