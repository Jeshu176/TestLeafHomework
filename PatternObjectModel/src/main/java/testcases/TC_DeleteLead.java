package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_DeleteLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "Delete_Lead";
		testDescription = "CreateLead";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName  = "dupdata";

	}
	@Test(dataProvider="fetchData")
	public void delete(String uname,String pwd,String fname) throws InterruptedException {
		new LoginPage().typeUserName(uname).typePassword(pwd).clickLogin()
		.clickcrm().leadsclick().findleadclick().fnameenter(fname).searchlead().selectlead().deleteclick().leadsclick().findleadclick().
		leadidenter().searchlead();
	}

}
