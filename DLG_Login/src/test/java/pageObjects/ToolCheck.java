package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class ToolCheck extends LocatorsUtil {

	WebDriver driver;

	public ToolCheck(WebDriver driver) {
		this.driver = driver;

	}
	
	public void enteruserdata(String userid, String password) {
		
		driver.findElement(username_login).sendKeys(userid);
		driver.findElement(password_login).sendKeys(password);
		
	}

	public void clickLogin() {
		
		driver.findElement(button_login).click();
		
	}

	public void verifySuccessMessage() {
		
		String expected_success_message = "Successfully logged in!";
		String actual_message = driver.findElement(success_mesg).getText();
		Assert.assertEquals(expected_success_message, actual_message);
		
	}

	public void verifyErrorMessage() {
	
		String expected_success_message = "Error message";
		String actual_message = driver.findElement(error_mesg).getText();
		Assert.assertEquals(expected_success_message, actual_message);
		
	}

	public void verifyErrorMessageReOccurence() {

		List<WebElement> error_messages = driver.findElements(error_mesg);
		System.out.println(error_messages.size());
	
		
	}

}
