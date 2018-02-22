package com.selenium.maintopics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesUtility {

	public static Properties pobject;

	static {
		try {
			pobject= new Properties();
			FileInputStream fin = new FileInputStream(
					System.getProperty("user.dir") + "\\locator.properties");
			
			pobject.load(fin);
			fin.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public By getLocators(String elementName) {

		String locatorTypeNadValue = pobject.getProperty(elementName);

		// now Split locatorTypeNadValue

		String[] valueArray = locatorTypeNadValue.split(":");

		String locatoryType = valueArray[0];
		String locatoryValue = valueArray[1];

		switch (locatoryType.toUpperCase()) {
		case "ID":
			return By.id(locatoryValue);
		case "NAME":
			return By.name(locatoryValue);
		case "TAGNAME":
			return By.tagName(locatoryValue);
		case "LINKTEXT":
			return By.linkText(locatoryValue);
		case "PARTIALLINKTEXT":
			return By.partialLinkText(locatoryValue);
		case "XPATH":
			return By.xpath(locatoryValue);
		case "CSS":
			return By.cssSelector(locatoryValue);
		case "CLASSNAME":
			return By.className(locatoryValue);
		default:
			return null;
		}

	}
public static void main(String[] args) {
	PropertiesUtility obj= new PropertiesUtility();
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\JavaPractice\\All jars\\SeleniumDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");

	driver.findElement(obj.getLocators("emailAddress")).sendKeys("Rajesh");
	
	
}
}
