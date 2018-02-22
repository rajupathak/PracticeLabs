package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WalletHubFacebookLogin {
	public static WebDriver driver;

	@Test
	public void LoginFacebook() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\JavaPractice\\All jars\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[contains(@id,'email')]")).sendKeys(
				"rajupthk1@gmail.com");
		driver.findElement(By.xpath("(.//*[contains(@id,'pass')])[1]"))
				.sendKeys("XYZ");

		driver.findElement(
				By.xpath("//table[@role='presentation']/tbody/tr[2]/td[3]/label/input[@value='Log In']"))
				.click();

		Actions action = new Actions(driver);

		action.moveToElement(
				driver.findElement(By
						.xpath("//div[@class='_4bl9 _42n-']/textarea [@name='xhpc_message']")))
				.click().sendKeys("abc").build().perform();
		driver.findElement(
				By.xpath("//div[@class='_1j2v']/div[3]/div/div[2]/div/button[@type='submit']"))
				.click();
		// driver.quit();

	}

}
