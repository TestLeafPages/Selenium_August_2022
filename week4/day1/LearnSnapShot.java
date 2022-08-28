package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSnapShot {
	public static void main(String[] args) throws IOException  {
		// To add driver to the code
		WebDriverManager.chromedriver().setup();

		// Open a browser
		ChromeDriver driver = new ChromeDriver();

		// To load an url
		driver.get("http://leaftaps.com/opentaps");

		// To maximize the browser
		driver.manage().window().maximize();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement img = driver.findElement(By.tagName("img"));
		// Take Screen shot
		File source = img.getScreenshotAs(OutputType.FILE);
		// Creating an empty image to store my ss
		File dest = new File("./snaps/Pic002.jpg");
		// Merge the ss with image
		FileUtils.copyFile(source, dest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
