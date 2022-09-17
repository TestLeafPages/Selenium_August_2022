package week7.day1;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeafTapsTestcases {
	

	@Test(timeOut = 5000,retryAnalyzer = RetryFailedTests.class)
	public void createLead() throws InterruptedException {
		int num = (int) (Math.random()*10000);
		System.out.println(num);
		Thread.sleep(num);
		System.out.println("create lead");
		
	}

	/*
	 * @Test(retryAnalyzer = RetryFailedTests.class) public void editLead() {
	 * 
	 * System.out.println("edit lead");
	 * 
	 * }
	 * 
	 * @Test(retryAnalyzer = RetryFailedTests.class) public void deleteLead() {
	 * 
	 * System.out.println("delete lead");
	 * 
	 * 
	 * }
	 */

}
