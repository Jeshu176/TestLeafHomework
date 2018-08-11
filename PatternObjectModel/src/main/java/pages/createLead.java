package pages;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class createLead extends SeMethods{
	public createLead() {
		PageFactory.initElements(driver, this);
		/*initiate this page's @FindBy commands
		for "driver"-->browser driver object*/
	}
 @FindBy(how=How.ID,using="createLeadForm_companyName")
 WebElement cmpnyname;
 @FindBy(how=How.ID,using="createLeadForm_firstName")
 WebElement elefname;
 @FindBy(how=How.ID,using="createLeadForm_lastName" )
WebElement elelname;
 @FindBy(how=How.NAME,using="submitButton")
 WebElement elesubmit;

 @And("enter companyName as (.*)")
public createLead typeCmpnyname(String data) {
	type(cmpnyname,data);
	return this;
	}
 @And("enter firstName as (.*)")
public createLead typefname(String data) {
	type(elefname,data);
	return this;
}
 @And("enter lastName as(.*)")
public createLead typelname(String data) {
	type(elelname,data);
	return this;
}
 @And("click create")
public viewLead clickSubmit() {
	click(elesubmit);
	return new viewLead();
	
}
}
