package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasics1 {
public static void main(String[] args) {
	// To add driver to the code
	WebDriverManager.chromedriver().setup();
	
	// Open a browser
	ChromeDriver driver = new ChromeDriver();
	
	// To load an url
	driver.get("http://leaftaps.com/opentaps");
	
	// To maximize the browser
	driver.manage().window().maximize();
	
	// To close the browser
	driver.close();
}
}
