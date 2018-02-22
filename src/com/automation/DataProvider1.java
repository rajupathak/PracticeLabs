package com.automation;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProvider1 {
	@DataProvider(name = "TestData")
	public static Object[][] getData(Method name) {
		Object[][] groupArray = null;
		if (name.getName().equalsIgnoreCase("loginTest1")) {

			groupArray = new Object[][] { { "A", "B" }, { "C", "D" },{ "E", "F" }};
		}

		else {
			groupArray = new Object[][] {

			{ "India" }, { "Bangalore" }, { "japan" }

			};
		}
		return groupArray;

	}

	/*@DataProvider(name ="NewTestData")
	public static Object[][] getNewTestData(ITestContext context) {
		Object[][] groupofArray = null;

		for (String group : context.getIncludedGroups()) {
			if (group.equalsIgnoreCase("Regression")) {
				groupofArray = new Object[][] { { "user1", "pass1" }, { "user2", "pas2" },{ "user3", "pass3" }};
				break;
			} else if (group.equalsIgnoreCase("Sanity")) {
				groupofArray = new Object[][] {{ "India" }, { "Bangalore" }, { "japan" }};
			}
			break;
		}

		return groupofArray;

	}*/
	@DataProvider(name="SearchProvider")
	public static Object[][] getDataFromDataprovider(ITestContext c){
	Object[][] groupArray = null;
		for (String group : c.getIncludedGroups()) {
		if(group.equalsIgnoreCase("A")){
			groupArray= new Object[][] { 
					{ "Guru99", "India" }, 
					{ "Krishna", "UK" }, 
					{ "Bhupesh", "USA" } 
				};
			
		}
			else 
			{
				groupArray= new Object[][] { 
						{  "Canada" }, 
						{  "Russia" }, 
						{  "Japan" } 
					};
			}
		
	}
		return groupArray;
		
		
		
	}

}
