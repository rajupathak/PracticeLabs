package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://html.com/tables/#Table_Code_Sample_Simple_Table");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		//driver.findElement(By.xpath(".//*[@id='austin-optin-wrapper']/a")).click();

		int TotalRow = driver.findElements(
				By.xpath(".//*[@id='post-382']/div/div[3]/table/tbody/tr"))
				.size();

		String firstPart = ".//*[@id='post-382']/div/div[3]/table/tbody/tr[";
		String secondPart = "]/td[2]";
		
		for(int i=2;i<=TotalRow;i++){
			String columnValue=driver.findElement(By.xpath(firstPart+i+secondPart)).getText();
			System.out.println("Column Values =" +columnValue );
		}
		
		
		
		
	}
}
