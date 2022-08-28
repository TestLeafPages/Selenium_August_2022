package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActions {
public static void main(String[] args) {
	// To add driver to the code
				WebDriverManager.chromedriver().setup();

				// Open a browser
				ChromeDriver driver = new ChromeDriver();

				// To load an url
				driver.get("https://jqueryui.com/draggable/");

				// To maximize the browser
				driver.manage().window().maximize();
				
				// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.switchTo().frame(0);
				
				WebElement element = driver.findElement(By.id("draggable"));
				
				Actions builder = new Actions(driver);
				
				builder.dragAndDropBy(element, 100, 100).perform();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
}
}
