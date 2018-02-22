package com.selenium.maintopics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ThreeWaysToSwitchBetweenTab {

	static WebDriver driver;

	public static void main(String[] args) {
		// First Way
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("some url");
		String parentWindow = driver.getWindowHandle();

		// Perform some Actions
		driver.findElement(By.xpath("")).click();

		// Now store all the windows in Set

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			String childWindow = (String) it.next();
			if (!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				// Perfrom some Action
				driver.close();
			}
		}

		driver.switchTo().defaultContent();

		// Second Way use ArrayList

		ArrayList<String> list = new ArrayList<String>(
				driver.getWindowHandles());

		driver.get("Second Url");

		driver.switchTo().window(list.get(1));
		// Perform some action

	
	//Third way using action class
		
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB);
		
		
// Using For Each Loop
		
		String parentWindoow=driver.getWindowHandle();
		for(String window:driver.getWindowHandles()){
			if(!window.equals(parentWindoow)){
				driver.switchTo().window(window);
			}
		}
		
		
		
	
	
	
	
	
	
	
	}

}
