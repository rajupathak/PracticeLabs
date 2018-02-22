package com.automation;

import org.testng.annotations.Test;

public class DataConsume {

	
	//@Test(dataProvider="TestData",dataProviderClass=DataProvider1.class,priority=1)
	public void loginTest1(String UserName,String Password){
		System.out.println("UserName>" +UserName);
		System.out.println("password>" +Password);
	}
	
	

	//@Test(dataProvider="TestData",dataProviderClass=DataProvider1.class,priority=2)
	public void loginTest2(String UserName){
		System.out.println("UserName>" +UserName);
		
	}
	
	
	@Test(dataProvider="SearchProvider",dataProviderClass=DataProvider1.class,groups="A")
	public void logintest2(String userName,String password){
		System.out.println("UserName>" +userName);
		System.out.println("password>" +password);
	}
	
	//@Test(dataProvider="NewTestData",dataProviderClass=DataProvider1.class,groups="Sanity")
	public void logintest3(String userName,String password){
		System.out.println("UserName>" +userName);
		System.out.println("password>" +password);
	}
	
	
	
	
}
