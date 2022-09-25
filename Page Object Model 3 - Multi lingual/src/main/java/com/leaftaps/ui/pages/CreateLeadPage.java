package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage(RemoteWebDriver recievedDriver) {
		this.driver = recievedDriver;
	}
	
	public CreateLeadPage enterCompanyName(String cname) {
		driver.findElement(By.id(prop2.getProperty("createleadpage.companyname"))).sendKeys(cname);
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fname) {
		driver.findElement(By.id(prop2.getProperty("createleadpage.firstname"))).sendKeys(fname);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lname) {
		driver.findElement(By.id(prop2.getProperty("createleadpage.lastname"))).sendKeys(lname);
		return this;
	}
	
	public ViewLeadPage clickCreateLead_positive() {
		driver.findElement(By.name(prop2.getProperty("createleadpage.createlead"))).click();
		return new ViewLeadPage(driver);
		
	}

}
