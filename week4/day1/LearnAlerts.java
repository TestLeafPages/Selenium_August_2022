package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {
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
			driver.findElement(By.xpath("//span[text()='Alert']/ancestor::a")).click();
			driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[4]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@aria-label='Close'])[2]")).click();
//			Alert alert = driver.switchTo().alert();
//			String text = alert.getText();
//			System.out.println(text);
////			alert.accept();
//			driver.findElement(By.xpath("(//span[text()='Show']/ancestor::button)[2]")).click();
//






}
}
