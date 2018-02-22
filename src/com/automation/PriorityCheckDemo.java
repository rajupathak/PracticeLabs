package com.automation;

import org.testng.annotations.Test;

public class PriorityCheckDemo {

	@Test(priority = 0)
	public void b_Test() {
		System.out.println("b");
		
		
	}

	@Test
	public void d_Test() {
		System.out.println("d");
	}

	@Test
	public void a_Test() {
		System.out.println("a");
	}

	@Test(priority = 2)
	public void c_Test() {
		System.out.println("c");
	}
}
