package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {

	public WelcomePage(RemoteWebDriver recievedDriver) {
		this.driver = recievedDriver;
	}
	
	public HomePage clickCRMSFA() {
		driver.findElement(By.linkText(prop2.getProperty("welcomepage.crmsfa"))).click();
		return new HomePage(driver);
	}
	
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}

}
