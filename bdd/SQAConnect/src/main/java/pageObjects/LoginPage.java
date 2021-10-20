package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	
	
public WebDriver driver;

public LoginPage(WebDriver driver) {
	this.driver = driver;
}
	
	By email= By.id("Email");
	By password= By.id("Password");
	By submit = By.xpath("//input[@type='submit']");
	
	
	
	

	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement submitButton()
	{
		return driver.findElement(submit);
	}

}
