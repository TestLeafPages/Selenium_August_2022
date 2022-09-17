package week7.day1;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnGroups {

	@Test(groups = "smoke")
	public void createLead() { // passed

		System.out.println("create lead");

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("Demo");

	}

	@Test(groups = "smoke")
	public void login() { // failed

		System.out.println("login");

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username123")).sendKeys("Demo");

	}

	@Test(groups = "functional", dependsOnGroups = "smoke")
	public void editLead() {

		System.out.println("edit lead");

	}

	@Test(groups = "functional", dependsOnGroups = "smoke")
	public void deleteLead() {

		System.out.println("delete lead");

	}

	@Test(groups = { "functional", "regression" }, priority = 4, dependsOnGroups = "smoke")
	public void duplicateLead() {

		System.out.println("duplicate lead");

	}

	@Test(groups = "regression", priority = 5, dependsOnGroups = { "smoke", "functional" })
	public void mergeLead() {

		System.out.println("merge lead");

	}

}
