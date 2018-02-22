package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassingNullInSendKey {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\JavaPractice\\All jars\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=_fZxWrfLDuGK8Qe8-4PADg&gws_rd=ssl");
		WebElement searchBox = driver
				.findElement(By
						.xpath("//div[contains(@class,'sfibbbc')]//div[contains(@id,'sb_ifc0')]/div/input[1]"));
		String s= null;
		searchBox.sendKeys(s);
		
		
		
	}
}
