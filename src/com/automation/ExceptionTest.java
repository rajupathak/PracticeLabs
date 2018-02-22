package com.automation;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test()
	public void DivideByZeroExample(){
		int a=10/0;
		System.out.println("Test Case Passed");
	}
	

	@Test( expectedExceptions=ArithmeticException.class)
	public void DivideByZeroExample1(){
		int a=10/0;
		System.out.println("Test Case Passed");
	}
	
}
