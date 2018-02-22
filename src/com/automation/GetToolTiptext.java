package com.automation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetToolTiptext {
	@Test
	public void GetToolTiptextDemo(){
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_tooltip");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement element=driver.findElement(By.className("tooltip"));
		Actions builder= new Actions(driver);
		builder.clickAndHold(element).perform();
		WebElement element1=driver.findElement(By.xpath("//div[@class='tooltip']/span[text()='Tooltip text']"));
		String toolTipText=element1.getText();
		System.out.println(toolTipText);
		Assert.assertEquals("Tooltip text", toolTipText);
}
}
