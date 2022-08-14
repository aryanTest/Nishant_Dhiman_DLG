package stepDefinition;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.ToolCheck;

public class ToolCheckerSteps {

	static WebDriver driver = null;
	ToolCheck toolpage;
	ConfigFileReader configFileReader = new ConfigFileReader();;

	@Before
	public void browserSetUp() throws InterruptedException {
		String inBrowser = configFileReader.getApplicationBrowser();
		if (inBrowser.equals("chrome")) {
			WebDriverManager.chromedriver().version("104.0.5112.79").setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (inBrowser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}
	}

	@After
	public void broswerTearDown() {
		driver.quit();
	}
	
	//Methods for basic website accessibility

	@Given("User navigates to the browser to open the login URL")
	public void user_navigates_to_browserAndUrl() throws Throwable {
		toolpage = new ToolCheck(driver);
		driver.navigate().to(configFileReader.getApplicationUrl());
	}
	
	
	//Username and Password Entries

	@When("User enters the (.*) and (.*)")
	public void user_enters_data_for_login(String userid, String password) throws Throwable {
		
		toolpage.enteruserdata(userid, password);
	}
	
	//Clicking on Login

	@Then("User click on the Login button")
	public void user_clicks_on_Login_Button() throws Throwable {
		
		toolpage.clickLogin();
	}
	
	@And("User is able to see the successful message")
	public void user_message() throws Throwable {
		
		Thread.sleep(1000);
		toolpage.verifySuccessMessage();
	}
	
	@And("User is able to see the error message")
	public void user_error_message() throws Throwable {
		
		Thread.sleep(500);
		toolpage.verifyErrorMessage();

	}
	
	@And("User can see two error messages")
	public void user_error_message_twice() throws Throwable {
		
		Thread.sleep(500);
		toolpage.verifyErrorMessageReOccurence();

	}
	
}
