package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(RemoteWebDriver recievedDriver) {
		this.driver = recievedDriver;
	}
	
	public LoginPage enterUsername(String username) {
		driver.findElement(By.id(prop2.getProperty("loginpage.username"))).sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id(prop2.getProperty("loginpage.password"))).sendKeys(password);
		return this;
	}
	
	public WelcomePage clickLogin_positive() {
		driver.findElement(By.className(prop2.getProperty("loginpage.login"))).click();
		return new WelcomePage(driver);
	}
	
	public LoginPage clickLogin_negative() {
		driver.findElement(By.className(prop2.getProperty("loginpage.login"))).click();
		return this;
	}

}
