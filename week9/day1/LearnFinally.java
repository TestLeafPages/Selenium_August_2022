package week9.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFinally {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		try {
			
			driver.get("http://leaftaps.com/opentaps");
			driver.findElement(By.id("username123")).sendKeys("Demo");//NoSuchElementException
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
		}

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		System.out.println("End of Program");

	}

}
