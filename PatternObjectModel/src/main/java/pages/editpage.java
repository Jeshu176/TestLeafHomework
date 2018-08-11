package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class editpage extends SeMethods{
	public editpage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	WebElement editname;
	public editpage edit()
	{
		editname.clear();
		type(editname,"Chinthana");
		return this;
		
	}
	@FindBy(how=How.NAME,using="submitButton")
	WebElement update;
	public viewLead updateclick() {
		click(update);
		return new viewLead();
	}
}
