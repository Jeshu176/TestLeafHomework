package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class duplicatePage extends SeMethods{
	public duplicatePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.NAME,using="submitButton")
	WebElement updatecreate;
	public viewLead clickdup() {
		click(updatecreate);
		return new viewLead();
	}
}
