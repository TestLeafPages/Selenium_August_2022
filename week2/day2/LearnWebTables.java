package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTables {
public static void main(String[] args) {
	// To add driver to the code
		WebDriverManager.chromedriver().setup();
		
		// Open a browser
		ChromeDriver driver = new ChromeDriver();
		
		// To load an url
		driver.get("https://www.leafground.com/");
		
		// To maximize the browser
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//ul)[2]/li[4]/a")).click();
		
		driver.findElement(By.xpath("(//span[text()='Table']/parent::a)[2]")).click();
		
		List<WebElement> elementRows = driver.findElements(By.xpath("(//table)[6]/tbody/tr"));
		
		List<WebElement> elementCols = driver.findElements(By.xpath("(//table)[6]/tbody/tr[1]/td"));
		
		// Iteration for rows
		for(int i = 1; i <= elementRows.size(); i++) {
			// Iteration for cols
			for(int j = 1; j <= elementCols.size(); j++) {
				String text = driver.findElement(By.xpath("(//table)[6]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text + "     ");
			}
			System.out.println();
		}
		
		driver.findElement(By.xpath("")).clear();
		
		driver.findElement(By.xpath("")).sendKeys("MDU",Keys.TAB);
		
		
		
		
		
		
		
		
}
}
