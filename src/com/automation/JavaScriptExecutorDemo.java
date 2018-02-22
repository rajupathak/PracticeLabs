package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {
@Test
public void demo(){
	WebDriver driver= new HtmlUnitDriver(true);
	driver.get("http://www.facebook.com");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	String domain=js.executeScript("return document.domain;").toString();
	System.out.println("domain of the Site>"+domain);
	
	
	String url=js.executeScript("return document.URL;").toString();
	System.out.println("URL of the Site>"+url);
	

	String titleNwame=js.executeScript("return document.title;").toString();
	System.out.println("title of the Site>"+titleNwame);
	
	//Navigate to Some other site
	
	js.executeScript("window.location='http://www.google.com'");
	
	String domain1=js.executeScript("return document.domain;").toString();
	System.out.println("domain of the Site>"+domain1);
	
	
	String url1=js.executeScript("return document.URL;").toString();
	System.out.println("URL of the Site>"+url1);
	

	String titleNwame1=js.executeScript("return document.title;").toString();
	System.out.println("title of the Site>"+titleNwame1);
}
}
