package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApostropheExample {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/patharaj/Desktop/xyz.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//html/body/a[text()=\"link text's\"]")).click();
	
}
}
