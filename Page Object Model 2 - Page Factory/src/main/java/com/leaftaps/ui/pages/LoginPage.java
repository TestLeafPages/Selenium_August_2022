package com.leaftaps.ui.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage(RemoteWebDriver recievedDriver) {
		this.driver = recievedDriver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBys({@FindBy(how = How.NAME, using = "USERNAME"),
	@FindBy(how = How.XPATH, using = "//input[@type='text']")}) private WebElement elementUser;
	
	
	
	
	@FindBy(how = How.ID, using = "username") 
	private WebElement elementUsername;
	
	// For findElements ->
	@FindBy(how = How.ID, using = "username") 
	private List<WebElement> elementLeadID;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "password") 
	private WebElement elementPassword;
	
	@CacheLookup
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit") 
	private WebElement elementLogin;
	
	public LoginPage enterUsername(String username) {
		elementUsername.sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		elementPassword.sendKeys(password);
		return this;
	}
	
	public WelcomePage clickLogin_positive() {
		elementLogin.click();
		return new WelcomePage(driver);
	}
	
	public LoginPage clickLogin_negative() {
		elementLogin.click();
		return this;
	}
	
	public WelcomePage loginToLeaftaps(String username, String password) {
		elementUsername.sendKeys(username);
		elementPassword.sendKeys(password);
		elementLogin.click();
		return new WelcomePage(driver);
	}

}
