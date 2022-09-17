package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnGrouping {

	@Test(groups = "smoke", priority = 1)
	public void createAccount() {

		System.out.println("create Account");

	}

	@Test(groups = "functional" , priority = 2)
	public void editAccount() {

		System.out.println("edit Account");

	}

	@Test  (groups = "functional", priority = 3)
	public void deleteAccount() {

		System.out.println("delete Account");

	}

	
	@Test   (groups = {"functional", "regression"}, priority = 4)
	public void duplicateAccount() {

		System.out.println("duplicate Account");

	}
	
	@Test  (groups = "regression", priority = 5)
	public void mergeAccount() {

		System.out.println("merge Account");

	}
}
