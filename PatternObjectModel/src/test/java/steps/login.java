package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	RemoteWebDriver driver;
	@Given("Launch the Broswer")
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
}
	@And("Load the url")
	public void loadurl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And("Set implicitwait")
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
	@And("Enter the Username as (.*)")
	public void enterusername(String data) {
		driver.findElementById("username").sendKeys(data);
	}
	@And("Enter the password as (.*)")
	public void enterpassword(String data) {
		driver.findElementById("password").sendKeys(data);
	}
	@When("click login")
	public void clicklogin() throws InterruptedException {
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
	}
	@Then("close the browser")
	public void closebrowser() {
		driver.close();
	}
}
