package challenges;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageStatus {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");

		//get the state msg
		String states = driver.executeScript("return document.readyState").toString();

		//verification
		switch (states) {
		case "loading": System.out.println("The document is still loading.");			
		break;

		case "interactive": System.out.println("The document has finished loading.But sub-resources such as images, stylesheets and frames are still loading.");			
		break;

		case "complete": System.out.println("The page is fully loaded.");	
		break;

		default:
			break;
		}		



		
		
		
		

		/*	Note: document.readyState method return string. 

			-    its returns  loading  state     -> still page is loading.
			-    its returns  interactive  state -> Page loaded, but some of sub resources are still loading
			-    its returns  complete  state    -> Page completely loaded.*/
	}
}








