package com.selenium.maintopics;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FullPageScreenshot {
	@Test
	public void takeScreenShot() throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
		
		// Creating Robot class object
					Robot robotClassObject = new Robot();
					
					// Get screen size
					Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
					
					// Capturing screenshot by providing size
		            BufferedImage tmp = robotClassObject.createScreenCapture(screenSize); 
		            
		            // Defining destination file path
		            String path=System.getProperty("user.dir")+"\\ScreenCapturesPNG"+".png";
		            System.out.println(path);
		            // To copy temp image in to permanent file
		           ImageIO.write(tmp, "png",new File(path)); 
		            
		            
		            
				}
		
	}

