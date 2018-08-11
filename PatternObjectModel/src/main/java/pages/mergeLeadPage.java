package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class mergeLeadPage extends ProjectMethods{
	String s1;
	public mergeLeadPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	WebElement elefromimg;
	@FindBy(how=How.ID,using="ext-gen27")
	WebElement fromid;
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	WebElement findclick;
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement firstId;
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	WebElement eletoimg;
	@FindBy(how=How.ID,using="ext-gen27")
	WebElement toid;
	@FindBy(how=How.LINK_TEXT,using="Merge")
	WebElement merge;
	public mergeLeadPage fromclick(String fname) throws InterruptedException {
		click(elefromimg);
		switchToWindow(1);
		type(fromid,fname);
		click(findclick);
		Thread.sleep(3000);
		click(firstId);
		
		return this;
		}
	public mergeLeadPage toclick(String lname) throws InterruptedException {
		switchToWindow(0);
		click(eletoimg);
		switchToWindow(1);
		type(toid,lname);
		click(findclick);
		Thread.sleep(3000);
		click(firstId);
		switchToWindow(0);
		click(merge);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		return this;
	}
	

}
