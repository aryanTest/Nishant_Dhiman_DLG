package pageObjects;

import org.openqa.selenium.By;

public class LocatorsUtil {

	// Locators as per xpath
	
	By username_login = By.xpath("//input[@name='loginUsername']");
	By password_login = By.xpath("//input[@name='loginPassword']");
	By button_login = By.xpath("//button[text()='Login']");
	By success_mesg = By.xpath("//div[@class='logged-in__success']");
	By error_mesg = By.xpath("//div[@class='form-field__error']");
	
}
