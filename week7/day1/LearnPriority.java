package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnPriority {

	@Test(priority = 1)
	public void createLead() {

		System.out.println("create lead");

	}

	@Test(priority = -5)
	public void editLead() {

		System.out.println("edit lead");

	}

	@Test(priority = 3)
	public void deleteLead() {

		System.out.println("delete lead");

	}

}
