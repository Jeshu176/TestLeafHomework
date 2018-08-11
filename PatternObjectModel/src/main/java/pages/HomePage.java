package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class HomePage extends SeMethods{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CLASS_NAME,using = "decorativeSubmit")
	private WebElement eleLogOut;
	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement elecrm;
	@And("click crmsfa")
	public myHome crm() {
		click(elecrm);
		return new myHome();}
	
		public myLead clickcrm() {
			click(elecrm);
			return new myLead();
		}
		
}
	
	
	


