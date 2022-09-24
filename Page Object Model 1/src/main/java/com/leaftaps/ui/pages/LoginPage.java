package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(RemoteWebDriver recievedDriver) {
		this.driver = recievedDriver;
	}
	
	public LoginPage enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
//		LoginPage page = new LoginPage();
//		return page;
//		return new LoginPage();
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	
	public WelcomePage clickLogin_positive() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	
	public LoginPage clickLogin_negative() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}

}
