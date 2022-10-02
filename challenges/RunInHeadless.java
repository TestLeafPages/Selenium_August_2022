package challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunInHeadless {
	
	@Test
	public void runDemo() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		// Headless mode
		ch.setHeadless(true);
		
		ChromeDriver driver = new ChromeDriver(ch);

		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("Demo")	;
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	

