package com.selenium.maintopics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allaboutcookie {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
		
	Set<Cookie>	cookie=driver.manage().getCookies();
		for(Cookie c:cookie){
			System.out.println(c.toString());
		}
	
	}
}
