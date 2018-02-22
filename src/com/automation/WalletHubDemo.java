package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WalletHubDemo {
	WebDriver driver;

	@Test
	public void closeAlert() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\JavaPractice\\All jars\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://wallethub.com/profile/test_insurance_company/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By
						.xpath("//*[contains(@id,'footer_cta')]//*[contains(@class,'af-icon-cross')]")));
		
		element.click();
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//div[@class='reviewinfo info']//*[contains(@class,'wh-rating rating_5')]/span"))).click()
				.build().perform();
	}
}
