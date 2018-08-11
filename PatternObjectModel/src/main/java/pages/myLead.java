package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class myLead extends ProjectMethods
{
	public myLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Leads")
	WebElement elelead;
	public findLead leadsclick() {
		click(elelead);
		return new findLead();
	}
}
