package challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDemo {
	
	@Test
	public void runDemo() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		
		// Headless mode
		ch.setHeadless(true);
		
		
		//to disable the browser notifications
		ch.addArguments("--disable-notifications");
		

		
		//To run in private mode
		ch.addArguments("--incognito");
		
		//To disable automation browser running infobar
		//ch.addArguments("--disable-infobars");
		
		//To maximize the browser
		ch.addArguments("--start-maximized");
		
		//To run the browser in full screen
		//ch.addArguments("--start-fullscreen");
		
		
		ChromeDriver driver = new ChromeDriver(ch);

		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("Demo")	;
		Thread.sleep(2000);
		//driver.quit();
	}
	
	
}
	
	
	
	
	
	
	
	
	
	

