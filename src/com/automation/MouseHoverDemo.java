package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverDemo {
@Test
public void multipleActionTest(){
	
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.id("email"));
	Actions builder= new Actions(driver);
	 Action seriesOfAction = builder.moveToElement(element).click().keyDown(element,Keys.SHIFT).sendKeys(element,"hello").keyUp(element,Keys.SHIFT).doubleClick(element).contextClick().build();
	seriesOfAction.perform();
}
}
