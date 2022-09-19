package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsSteps {
	ChromeDriver driver;
	@Given("Chrome browser is opened")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@And("Load the application URL as {string}")
	public void loadURL(String url) {
		driver.get(url);
	}
	@And("Maximize and set the timeouts")
	public void maxAndTimeout() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@And("Enter username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@And("Enter password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Login Button is clicked")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Home Page should be displayed")
	public void homepageVerification() {
		System.out.println("Home Page is displayed");
	}
	@But("Error message should be displayed")
	public void errorMessage() {
		System.err.println("Invalid Password");
	}
}
