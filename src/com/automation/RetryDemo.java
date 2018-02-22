package com.automation;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class RetryDemo {
	@Test(retryAnalyzer=Retry.class)
	public void test() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	
	public void test1() {
		Assert.assertEquals(true, true);
	}
}
