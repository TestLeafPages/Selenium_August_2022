package challenges;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementHighlight {
	
	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("http://jqueryui.com/");
		//driver.executeScript(script, args)
		WebElement checkIn =driver.findElement(By.linkText("Demos"));

		for (int i = 0; i < 20; i++) {
			//WebElement checkIn = driver.findElementByXPath("//img[@alt='Support the jQuery Foundation']");

			driver.executeScript("arguments[0].setAttribute('style', arguments[1]);", checkIn,
					"color: Yellow; border: 10px dotted solid green;");
			Thread.sleep(300);
			driver.executeScript("arguments[0].setAttribute('style', arguments[1]);", checkIn,
					"color: transparent;");
			Thread.sleep(300);
		}
	}
	}
