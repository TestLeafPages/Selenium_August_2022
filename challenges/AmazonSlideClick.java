package challenges;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSlideClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		

		WebElement imageEle = driver.findElement(By.xpath("//li[@class='a-carousel-card' and @aria-hidden='false']//img[@alt='Mobiles']"));

		driver.executeScript("arguments[0].click();", imageEle);
		//driver.quit();

	}

}
