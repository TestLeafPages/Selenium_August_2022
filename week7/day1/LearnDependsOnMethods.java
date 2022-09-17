package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDependsOnMethods {

	@Test
	public void createLead() {

		System.out.println("create lead");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username123")).sendKeys("Demo");

	}

	@Test(dependsOnMethods = "week7.day1.LearnDependsOnMethods.createLead")
	public void editLead() {

		System.out.println("edit lead");

	}

	@Test (dependsOnMethods = {"week7.day1.LearnDependsOnMethods.createLead","week7.day1.LearnDependsOnMethods.editLead"})
	public void deleteLead() {

		System.out.println("delete lead");

	}

}
