package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class LoginPage extends SeMethods{


	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="username")
	private WebElement eleUserName;

	@And("enter the username as (.*)")
	public LoginPage typeUserName(String data) {
		// eleUName = locateElement("username");
		type(eleUserName, data);		
		return this;
	}

	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;
	@And("enter the password as (.*)")
	public LoginPage typePassword(String data) {
		type(elePassword, data);
		return this;
	}


	@FindBy(how=How.CLASS_NAME,using = "decorativeSubmit")
	private WebElement eleLogin;

	@And("click login button")
	public HomePage clickLogin() {
		click(eleLogin);	
		return new HomePage();
	}
	
	
	public LoginPage verifyLogin() {
		verifyEnabled(eleLogin);	
		return this;
	}
	
	
	
	
	
	
	
	
	
	




}
