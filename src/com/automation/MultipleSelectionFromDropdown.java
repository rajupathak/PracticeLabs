package com.automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleSelectionFromDropdown {

	@Test
	public void selectMultipleCity() throws InterruptedException {

		List <String>country=new ArrayList<>();
        country.add("Arizona");
        country.add("Hawaii");

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		Options OptionObj = driver.manage();
		Window windowobj = OptionObj.window();
		windowobj.maximize();
		
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		

		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("scrollTo(0, 1200)");

		driver.findElement(
				By.xpath("(//*[contains(@class,'selection multiple')]//i)[2]"))
				.click();
        Thread.sleep(2000);
		List<WebElement> list = driver
				.findElements(By
						.xpath("//div[contains(@class,'menu transition visible')]/div"));
		System.out.println("Size" + list.size());
		for (int i = 0; i < list.size(); i++) {
			String CityValue = list.get(i).getText();
			for (int j = 0; j < country.size(); j++) {
				String SelectCity = country.get(j);
			if(CityValue.equalsIgnoreCase(SelectCity)){
				list.get(i).click();
			}
		}

	}

}
}
