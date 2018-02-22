package com.automation;

import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WalletHubExample {
	String ExpectedPost;
	StringBuilder currentLine;
	WebDriver driver;
	private String dropDownValue = "Health";
	private static final String FILENAME = System.getProperty("user.dir")
			+ "\\src\\main\\java\\com\\wallethub\\UIAutomation\\WalletHubProfileUiAutomation\\properties\\ReviewComments.text";

	@Test(priority = 1)
	public void Demo() throws Exception {
		// WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		driver.manage().window().maximize();
		driver.navigate().to(
				"http://wallethub.com/profile/test_insurance_company/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By
				.xpath(".//*[contains(@id,'footer_cta')]//*[contains(@class,'af-icon-cross')]"))));
		driver.findElement(
				By.xpath(".//*[contains(@id,'footer_cta')]//*[contains(@class,'af-icon-cross')]"))
				.click();
		Thread.sleep(2000);
		action.moveToElement(
				driver.findElement(By
						.xpath(".//*[contains(@id,'wh-body-inner')]//*[contains(@class,'reviewinfo info')]/span")))
				.build().perform();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath(".//*[contains(@id,'wh-body-inner')]//*[contains(@class,'wh-rating-choices')]//a[5]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[contains(@class,'dropdown-title')]"))
				.click();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		List<WebElement> list = wait
				.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By
						.xpath(".//*[contains(@class,'product')]//*[contains(@class,'drop-el')]//li"))));

		for (int i = 0; i < list.size(); i++) {
			String actaultest = list.get(i).getText();
			System.out.println(actaultest);
			if (actaultest.equalsIgnoreCase(dropDownValue)) {

				list.get(i).click();

				break;

			}
		}
		Thread.sleep(2000);
		// driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(By.xpath(".//*[contains(@id,'overallRating')]/a[5]"))
				.click();

	}

	@Test(priority = 2)
	public void EnterText() throws Exception {
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//*[contains(@id,'review-content')]"))
				.clear();
		driver.findElement(By.xpath(".//*[contains(@id,'review-content')]"))
				.click();

		BufferedReader br = new BufferedReader(new FileReader(FILENAME));
		try {
			currentLine = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				currentLine.append(line);
				line = br.readLine();
			}
			ExpectedPost = currentLine.toString();
		} finally {
			br.close();
		}
		driver.findElement(By.xpath(".//*[contains(@id,'review-content')]"))
				.sendKeys(ExpectedPost);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(
				By.xpath(".//*[contains(@id,'reviewform')]//*[contains(@class,'content')]//*[contains(@class,'submit')]//input"))
				.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.navigate().to(
				"https://wallethub.com/profile/rajupthk01/reviews/");
		String ActualPosted = driver
				.findElement(
						By.xpath(".//*[contains(@class,'wh-profile-tab-contents')]//*[contains(@class,'reviews')]//p[1]"))
				.getText();
		System.out.println("Actual Post -" + ActualPosted);
		System.out.println("Expected Post -" + ExpectedPost);

		assertEquals(ActualPosted, ExpectedPost);
		System.out.println("Test Case Passed");
		driver.quit();

	}
}
