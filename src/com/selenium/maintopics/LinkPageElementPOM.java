package com.selenium.maintopics;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LinkPageElementPOM {

	WebDriver driver;
	String expectedText="Elements";

	@FindBy(xpath = "//div[@id='leftmenuinnerinner']//a")
	List<WebElement> links;

	@FindBy(xpath = ".//*[@id='main']/h1/span")
	WebElement pageText;

	public LinkPageElementPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnEachLink() {

		String actualText = null;
		for (int i = 2; i < links.size(); i++) {
			links.get(i).click();

			actualText = pageText.getText();
			if(actualText.equals(expectedText)){
				Assert.assertEquals(actualText, expectedText);
				break;
			}
			else{
				driver.navigate().back();
				
			}

		}
		

	}
}
