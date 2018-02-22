package com.selenium.maintopics;


import org.testng.annotations.Test;

public class IAnnotaionExample {

	@Test
	public void m1(String param) {

		System.out.println("test Data are:" + param);
	}

	@Test
	public void m2(String param) {
		System.out.println("test Data are:" + param);
	}

	@Test
	public void m3(String param) {
		System.out.println("Inside m3");
		System.out.println("test Data are:" + param);
	}

}
