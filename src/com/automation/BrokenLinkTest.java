package com.automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinkTest {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\JavaPractice\\All jars\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.tagName("a"));

		Iterator<WebElement> iterator = list.iterator();
		while (iterator.hasNext()) {
			String url = iterator.next().getAttribute("href");

			if (url == null || url.isEmpty()) {
				continue;
			}
			/*if (!url.startsWith(homePageURl)) {
				continue;
			}*/

			verfiyActiveLink(url);

		}

	}

	private static void verfiyActiveLink(String linkurl) throws IOException {
				try {
				
					URL url= new URL(linkurl);
					
				HttpURLConnection connectionObject = (HttpURLConnection) url.openConnection();
					
				connectionObject.setConnectTimeout(3000);
				connectionObject.connect();
					if(connectionObject.getResponseCode()==200){
						
						System.out.println(linkurl+" --"+ connectionObject.getResponseMessage());
					}
					
					if(connectionObject.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
						System.out.println(linkurl+" --"+ connectionObject.getResponseMessage()+"---"+ HttpURLConnection.HTTP_NOT_FOUND);
					}
				} catch (MalformedURLException e) {
					
					e.printStackTrace();
				}
	}
}
