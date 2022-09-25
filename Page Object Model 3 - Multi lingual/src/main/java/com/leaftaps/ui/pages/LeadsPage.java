package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {

	public LeadsPage(RemoteWebDriver recievedDriver) {
		this.driver = recievedDriver;
	}
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText(prop2.getProperty("leadspage.createlead"))).click();
		return new CreateLeadPage(driver);
	}
	
	public MergeLeadPage clickMergeLead() {
		driver.findElement(By.linkText(prop2.getProperty("leadspage.mergelead"))).click();
		return new MergeLeadPage(driver);
	}

}
