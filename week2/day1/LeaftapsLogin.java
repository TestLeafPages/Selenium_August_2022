package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsLogin {
public static void main(String[] args) {
		// To add driver to the code
		WebDriverManager.chromedriver().setup();
		
		// Open a browser
		ChromeDriver driver = new ChromeDriver();
		
		// To load an url
		driver.get("http://leaftaps.com/opentaps");
		
		// To maximize the browser
		driver.manage().window().maximize();
		
		// To find the element
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
		String text = elementWelcomeMessage.getText();
		System.out.println(text);
		
		if(text.contains("Welcome")) {
			System.out.println("Login successfull");
		}else {
			System.out.println("Login is failed");
		}
		
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		// Way 1 to handle drop down
		// elementSourceDD.sendKeys("Employee");
		
		// Find the drop down element in Select tag
		WebElement elementSourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		// For handling drop down, we have Select class in Selenium
		Select dd = new Select(elementSourceDD);
		
		// 1. using Index
		// dd.selectByIndex(3);
		
		// 2. using Visible Text
		// dd.selectByVisibleText("Word of Mouth");
		
		// 3. using value attribute
		dd.selectByValue("LEAD_EXISTCUST");
		
		WebElement elementIndustryDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd1 = new Select(elementIndustryDD);
		
		
}
}








