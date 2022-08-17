package week2.doubts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//cntrl+shift+o

public class Login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		
		WebElement eleFirstLeadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		
		String leadId= eleFirstLeadId.getText();
		eleFirstLeadId.click();
		
		driver.findElement(By.name("id")).sendKeys(leadId);
		
		boolean displayed = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
	}

}
