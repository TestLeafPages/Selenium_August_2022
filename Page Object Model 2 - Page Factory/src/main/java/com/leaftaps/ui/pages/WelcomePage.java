package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {

	public WelcomePage(RemoteWebDriver recievedDriver) {
		this.driver = recievedDriver;
		PageFactory.initElements(driver, this);

	}
	
	public HomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);
	}
	
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}

}
