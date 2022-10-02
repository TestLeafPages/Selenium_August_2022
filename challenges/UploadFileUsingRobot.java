package challenges;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileUsingRobot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		

		Thread.sleep(2000);
		WebElement uploadButton = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		uploadButton.click();
		
		
		//  Actions builder = new Actions(driver);
		//  builder.click(uploadButton).perform();
		 
		
		Thread.sleep(5000);
		
		// Store the copied text in the clipboard
		StringSelection stringSelection = new StringSelection("C:\\Users\\Admin\\Selenium-Frameworks\\AutomationChallenges\\data\\Bala_CV.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		
		// Paste it using Robot class
		Robot robot = new Robot();

		// Enter to confirm it is uploaded
		robot.keyPress(KeyEvent.VK_CONTROL);			
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);	

		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
			
		//Thread.sleep(3000);
		//driver.findElementById("file_upload").sendKeys("C:\\Users\\hp\\Desktop\\Resume.docx");
		
	}
		
}
