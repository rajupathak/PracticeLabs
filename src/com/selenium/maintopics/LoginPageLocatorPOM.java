package com.selenium.maintopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLocatorPOM {

	static WebDriver driver;

	public static LoginPageLocatorPOM getPageElement(WebDriver driver) {
		return PageFactory.initElements(driver, LoginPageLocatorPOM.class);
	}

	/*@FindBy(id = "FirstName")
	private WebElement firstName;*/
	private WebElement FirstName;

	public WebElement getFirstName() {
		return FirstName;
	}

	@FindBy(id = "LastName")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}

	@FindBy(id = "GmailAddress")
	private WebElement gmailAddress;

	public WebElement getGmailAddress() {
		return gmailAddress;
	}

}
