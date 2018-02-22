package com.selenium.maintopics;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	
	@DataProvider
	public static   Object[][] loginData(){
		return new Object[][]{{"ABC"},{"DEF"},{"GEH"}};
	}
	
	@DataProvider
	public static   Object[][] homeData(){
		return new Object[][]{{"IJK"},{"LMN"},{"OPQ"}};
	}
	
	
	@DataProvider
	public static   Object[][] paymentData(){
		return new Object[][]{{"rst"},{"uvw"},{"xyz"}};
	}
	
}
