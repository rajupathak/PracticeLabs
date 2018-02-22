package com.automation;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRandamValueFromDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\JavaPractice\\All jars\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");

		

		for (int i = 0; i <= 3; i++) {
			driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]/div[2]"))
			.click();

			List<WebElement> months = driver
					.findElements(By
							.xpath("//label[contains(@id,'month-label')]//div[contains(@class,'goog-menu goog-menu-vertical')]//div[@class='goog-menuitem-content']"));

			
			int size= months.size();
			
			System.out.println("Total Month in the drop down"+size);
			
		int randomNumber=	ThreadLocalRandom.current().nextInt(0,size);
			
			// Selecting random value
			
			months.get(randomNumber).click();
			
			Thread.sleep(2000);
			
			
		}
	}
}
