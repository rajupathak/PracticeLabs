package com.automation;

import junit.framework.Assert;

import org.testng.annotations.Test;

@SuppressWarnings("deprecation")
public class ReRunFailedTestDemo {
	@Test
	@ReRunFailedTestCases(10)
	public void test() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	
	public void test1() {
		Assert.assertEquals(true, true);
	}
}
