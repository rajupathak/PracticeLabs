package com.automation;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HandlingUntrustedSites {

	@Test
	public void handlingUntrustedSite() {
/*
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);*/

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cacert.org/");
		driver.manage().window().maximize();
	}
}
