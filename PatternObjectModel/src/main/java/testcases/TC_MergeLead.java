package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC_MergeLead extends ProjectMethods {
		@BeforeTest
		public void setData() {
			browserName = "chrome";
			testCaseName = "Merge_Lead";
			testDescription = "CreateLead";
			testNodes = "Leads";
			category = "smoke";
			authors = "sarath";
			dataSheetName  = "deletedata";

		}
		@Test(dataProvider="fetchData")
		public void delete(String uname,String pwd,String fname,String lname) throws InterruptedException {
			new LoginPage().typeUserName(uname).typePassword(pwd).clickLogin()
			.clickcrm().leadsclick().merge().fromclick(fname).toclick(lname);
}
}