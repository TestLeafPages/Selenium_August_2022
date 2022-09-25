package com.leaftaps.ui.leads.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "tc001";
	}

	@Test(dataProvider = "sendData")
	public void runCreateLead(String username, String password, String cname, String fname, String lname) {
		/*LoginPage page = new LoginPage();
		page.enterUsername(username);
		page.enterPassword(password);
		page.clickLogin_positive();
		
		WelcomePage page1 = new WelcomePage();
		page1.clickCRMSFA();*/
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin_positive()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateLead_positive()
		.getLeadID();
		
		
	}

}
