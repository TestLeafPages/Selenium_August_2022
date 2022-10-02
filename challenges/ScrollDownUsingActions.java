package challenges;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDownUsingActions {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// load the browser with url
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22536");
		
		WebElement uploadResume = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		
		Actions builder = new Actions(driver);
		builder.scrollToElement(uploadResume).perform();
		

	}
}



