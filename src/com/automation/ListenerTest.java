package com.automation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ListenerTest extends ListenerDemo{

	
	@BeforeSuite
	public void m1(){
		System.out.println("i am the second");
	}
	
	@BeforeTest
	public void m2(){
		System.out.println("I am the third");
	}
	
	
	@BeforeTest
	public void m3(){
		System.out.println("I am the fourth");
	}
	@BeforeMethod
	public void m4(){
		System.out.println("I am the five");
	}
}
