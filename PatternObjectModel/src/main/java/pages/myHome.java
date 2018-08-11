package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class myHome extends SeMethods{
	public myHome() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement elecreateLead;
	@And("click Lead")
	public createLead create() {
		click(elecreateLead);
		return new createLead();
		}
	

	}
	

