package testcases;

import wdMethods.ProjectMethods;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TC_CreateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "Create_Lead";
		testDescription = "CreateLead";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName  = "data";
	}

	@Test(dataProvider="fetchData")
	public void clickCrm(String uname,String pwd,String cname,String fname,String lname) {
		new LoginPage().typeUserName(uname).typePassword(pwd).clickLogin()
		.crm().create().typeCmpnyname(cname).typefname(fname).typelname(lname).clickSubmit();
		
		
	}

}
