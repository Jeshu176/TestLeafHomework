package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class findLead extends ProjectMethods{
	
	public findLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="ext-gen248")
	WebElement elefname;
	public findLead fnameenter(String fname) {
		type(elefname,fname);
		return this;
		
	}
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	WebElement eleleadenter;
	public findLead leadidenter() {
		type(eleleadenter,text);
		return this;
	}
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	WebElement elefind;

	public findLead searchlead() throws InterruptedException {
		click(elefind);
		Thread.sleep(3000);
		return this;
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement lead;
	public  viewLead selectlead() {
		text=getText(lead);
		System.out.println(text);
		
		click(lead);
	
		return new viewLead();}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	WebElement elefindlead;
	public findLead findleadclick() {
		click(elefindlead);
		return new findLead();}
		@FindBy(how=How.LINK_TEXT,using="Merge Leads")
		WebElement mergeleads;
		public mergeLeadPage merge() {
			click(mergeleads);
			return new mergeLeadPage();
		
	}


		
	}

