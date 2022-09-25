package com.leaftaps.ui.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leaftaps.ui.utils.ReadExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	public RemoteWebDriver driver;
	public static Properties prop2;
	public String excelFileName;
	@BeforeMethod
	public void beforeMethod() throws IOException {
		
		Properties prop1 = new Properties();
		FileInputStream file = new FileInputStream("./configurations/config.properties");
		prop1.load(file);
		
		prop2 = new Properties();
		FileInputStream file1 = new FileInputStream
				("./configurations/"+prop1.getProperty("language")+".properties");
		prop2.load(file1);
		
		if(prop1.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(prop1.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop1.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		String[][] data = ReadExcelData.getData(excelFileName);
		return data;
	}
}
