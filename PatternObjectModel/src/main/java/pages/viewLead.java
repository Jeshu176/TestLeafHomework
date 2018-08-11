package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class viewLead extends ProjectMethods{
public viewLead() {
	PageFactory.initElements(driver, this);
}
@FindBy(how=How.LINK_TEXT,using="Delete")
WebElement delete;
@FindBy(how=How.LINK_TEXT,using="Edit")
WebElement eleedit;
@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
WebElement eledup;
public myLead deleteclick() {
	click(delete);
	return new myLead();
}
public editpage editclick() {
	click(eleedit);
	return new editpage();
}
public duplicatePage dupclick() {
	click(eledup);
	return new duplicatePage();
}
}
