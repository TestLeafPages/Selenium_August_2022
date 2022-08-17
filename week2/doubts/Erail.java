package week2.doubts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//cntrl+shift+o

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement fromStation = driver.findElement(By.id("txtStationFrom")); //30 secs
		fromStation.clear();
		fromStation.sendKeys("MAS");
		Thread.sleep(2000); //1500 waste
		fromStation.sendKeys(Keys.ENTER);
		
		
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("NMKL");
		Thread.sleep(500);
		toStation.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		Thread.sleep(1000);
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		int numOfRows = allRows.size();
		
		for (int i = 1; i <= numOfRows; i++) {
			
			String trainName = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a")).getText();
			
			System.out.println(trainName);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
