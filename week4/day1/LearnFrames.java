package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {
public static void main(String[] args) throws InterruptedException {
	// To add driver to the code
			WebDriverManager.chromedriver().setup();

			// Open a browser
			ChromeDriver driver = new ChromeDriver();

			// To load an url
			driver.get("https://jqueryui.com/selectable/");

			// To maximize the browser
			driver.manage().window().maximize();
			
			// Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			// To get into the frame
			WebElement frameElement = driver.findElement(By.className("demo-frame"));
			driver.switchTo().frame(5);
			driver.findElement(By.xpath("//li[text()='Item 1']")).click();
			// To come out of the frame
			driver.switchTo().defaultContent();
			driver.findElement(By.linkText("Download")).click();






}
}
