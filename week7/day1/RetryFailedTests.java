package week7.day1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer{
	
	int retryCount = 0; // initial value

	public boolean retry(ITestResult result) {
		if(retryCount < 3) {
			
			retryCount++;
			
			return true; // it will again retry
		}
		
		return false; // it will stop the retry
	}

}
