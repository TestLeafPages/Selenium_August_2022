package challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class LauchDriver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//EdgeDriver driver = new EdgeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

	}

}
