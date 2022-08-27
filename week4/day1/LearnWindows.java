package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {
public static void main(String[] args) throws InterruptedException {
	// To add driver to the code
			WebDriverManager.chromedriver().setup();

			// Open a browser
			ChromeDriver driver = new ChromeDriver();

			// To load an url
			driver.get("https://www.leafground.com/");

			// To maximize the browser
			driver.manage().window().maximize();
			
			// Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//*[text()='Browser']/ancestor::a")).click();
			driver.findElement(By.xpath("//span[text()='Window']/ancestor::a")).click();
			
			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
			
			driver.findElement(By.xpath("//span[text()='Open']/ancestor::button")).click();
			
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles);
			List<String> list = new ArrayList<String>(windowHandles);
			
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(list.get(1));
			
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(list.get(0));
			
			System.out.println(driver.getTitle());



			
			
			
			
			
			
			
			
			
			
			

}
}
