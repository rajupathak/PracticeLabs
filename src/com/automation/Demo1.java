package com.automation;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {

	@Parameters({ "userName", "password" })
	@Test
	public void loginToApplication(String userName, String password) {
		System.out.println(userName);
		System.out.println(password);
	}

	@Parameters({"browserName"})
	@Test
	public void selectBrowser(@Optional("Firefox") String browserName ){
		System.out.println(browserName);
	}
}
