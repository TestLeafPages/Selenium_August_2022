package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWaits {
public static void main(String[] args) {
	// To add driver to the code
				WebDriverManager.chromedriver().setup();

				// Open a browser
				ChromeDriver driver = new ChromeDriver();

				// To load an url
				driver.get("https://www.leafground.com/window.xhtml");

				// To maximize the browser
				driver.manage().window().maximize();
				
				// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				
				driver.findElement(By.xpath("//span[text()='Open with delay']/ancestor::button")).click();
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
				wait.until(ExpectedConditions.numberOfWindowsToBe(3));
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println(windowHandles);
				List<String> list = new ArrayList<>(windowHandles);
				driver.switchTo().window(list.get(1));
				
				
				
				
				
				
				
}
}
