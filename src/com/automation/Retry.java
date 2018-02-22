package com.automation;

import junit.framework.Assert;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Retry implements IRetryAnalyzer {

	int minretryCount = 0;
	int maxretrycount = 2;

	@Override
	public boolean retry(ITestResult result) {

		if (minretryCount <= maxretrycount) {
			System.out.println("This test case is failed !!!!"
					+ result.getName());

			System.out.println("Retrying the test case count is !!!"
					+ (minretryCount + 1));
			minretryCount++;
			return true;

		}

		return false;
	}

	

	}
	

