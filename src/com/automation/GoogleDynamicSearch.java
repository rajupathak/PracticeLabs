package com.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleDynamicSearch {

	@Test
	public void verifyDynamicSearch() {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=QR5FWurwBOaeX8b2jYgI");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("testing");
		List<WebElement> listOfSelection = driver
				.findElements(By
						.xpath("//div[contains(@class,'sbsb_a')]/ul//li//div[contains(@class,'sbqs_c')]"));

		for (int i = 0; i < listOfSelection.size(); i++) {
			String text=listOfSelection.get(i).getText();
			System.out.println(text);
			
			if(text.contains("bangalore")){
				listOfSelection.get(i).click();
				break;
			}

		}

	}

}
