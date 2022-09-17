package com.leaftaps.testng.events;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer{
	
	int retryCount = 0; // initial value

	public boolean retry(ITestResult result) {
		if(retryCount < 2) {
			
			retryCount++;
			
			return true; // it will again retry
		}
		
		return false; // it will stop the retry
	}

}
