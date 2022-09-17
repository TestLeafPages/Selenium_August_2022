package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTimeOut {

	@Test(timeOut = 1000) // 1000 milliseconds = 1 sec
	public void createLead() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("create lead");

	}

	
}
