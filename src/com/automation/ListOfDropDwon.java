package com.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfDropDwon {
	static WebDriver driver;
	public static JavascriptExecutor js = (JavascriptExecutor) driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\JavaPractice\\All jars\\SeleniumDrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.navigate().to("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//div[contains(@id,'CountryCode')]")).click();
	
	List<WebElement> list = driver.findElements(By.xpath("//div[contains(@id,'CountryCode')]//div[contains(@class,'goog-menuitem-content')]"));

	for (int i = 0; i < list.size(); i++) {
		
		String dropdwontext = list.get(i).getText();
		System.out.println(dropdwontext);
		if (dropdwontext.equalsIgnoreCase("Zimbabwe")) {
			
			dropdwontext = list.get(i).getText();
			list.get(i).click();
			System.out.println("Selected Value is :: " + dropdwontext);
			if(i==25){
				js.executeScript("scroll(0,1200)");
			}
			break;
		}
	}
}
}
