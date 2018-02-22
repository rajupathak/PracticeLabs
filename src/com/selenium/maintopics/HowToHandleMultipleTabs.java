package com.selenium.maintopics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowToHandleMultipleTabs {
public static void main(String[] args) {
	
	 
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "\\Drivers1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
	 
	// Store all currently open tabs in tabs
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	System.out.println("Intially total tab:=" + tabs.size());
	 
	// Click on link to open in new tab
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("scroll(0,1200)");
	
	driver.findElement(By.xpath("//p[@class='why-information']/a[text()='Learn more']")).click();
	tabs = new ArrayList<String> (driver.getWindowHandles());
	System.out.println("After First click on Link total tab:=" + tabs.size());
	 
	// Switch newly open Tab
	driver.switchTo().window(tabs.get(1));
	
	driver.findElement(By.xpath("html/body/div[2]/div[2]/section/div/article/section/div/p[2]/a")).click();
	tabs = new ArrayList<String> (driver.getWindowHandles());
	System.out.println("After Second click on Link total tab:=" + tabs.size());
	driver.switchTo().window(tabs.get(0));
	 
	// Perform some operation on Newly open tab
	// Close newly open tab after performing some operations.
	//driver.close();
	 
	// Switch to old(Parent) tab.
	//driver.switchTo().window(tabs.get(0));
	
	
	 
	}
	 
	
}

