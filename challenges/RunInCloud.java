package challenges;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunInCloud {

	public static void main(String[] args) throws MalformedURLException {

		SafariOptions browserOptions = new SafariOptions();
		browserOptions.setPlatformName("macOS 12");
		browserOptions.setBrowserVersion("15");
		Map<String, Object> sauceOptions = new HashMap<>();
		sauceOptions.put("build", "<your build id>");
		sauceOptions.put("name", "<your test name>");
		browserOptions.setCapability("sauce:options", sauceOptions);

		
		RemoteWebDriver driver = new RemoteWebDriver(new URL(
				"https://uranus:f3ea5396-16b2-47fa-aa36-d2566bf8310b@ondemand.apac-southeast-1.saucelabs.com:443/wd/hub"),
				browserOptions);

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.close();

	}

}
