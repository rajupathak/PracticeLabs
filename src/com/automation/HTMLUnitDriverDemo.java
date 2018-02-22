package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HTMLUnitDriverDemo {
@Test

public void HTMLUnitBrowserTest(){
	
	WebDriver driver = new HtmlUnitDriver();
	driver.get("http://www.facebook.com");
	
	System.out.println(driver.getTitle());
	
}
}
