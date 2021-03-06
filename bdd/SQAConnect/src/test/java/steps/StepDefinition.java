package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import resources.TestBase;

public class StepDefinition extends TestBase {
	public WebDriver driver;

	LoginPage lp = new LoginPage(driver);
    	
    
    @Given("^the user have navigated to the estimates site$")
    public void the_user_have_navigated_to_the_estimates_site() throws IOException  {
    	driver = initializeDriver();
		driver.get(OR.getProperty("URL"));
		
    }

    @When("^the user enters his credentials$")
    public void the_user_enters_his_credentials() throws IOException  {
    	
    	lp.getEmail().sendKeys(OR.getProperty("email"));
		
		
		lp.getPassword().sendKeys(OR.getProperty("password"));
		
		//Assert.assertEquals(lp.getEmail().getText(), "Password");
		lp.submitButton().click();
    }

    @Then("^the user is navigated to the HomePage$")
    public void the_user_is_navigated_to_the_homepage()  {
    	
    }

}
