package steps;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;

import estimates.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;


public class stepDefinition extends TestBase {
	
	public static Logger log = LogManager.getLogger(TestBase.class.getName());
	
	LoginPage lp = new LoginPage(driver);  
    	
    
    @Given("^the user have navigated to the estimates site$")
    public void the_user_have_navigated_to_the_estimates_site() throws IOException  {
    	driver = initializeDriver();
		driver.get(OR.getProperty("URL"));
		log.info("Navigated to the URL");
    }

    @When("^the user enters his credentials$")
    public void the_user_enters_his_credentials()  {
    	lp.getEmail().sendKeys(OR.getProperty("email"));
		log.info(("Entered Email"));
		
		lp.getPassword().sendKeys(OR.getProperty("password"));
		log.info(("Entered Password"));
		//Assert.assertEquals(lp.getEmail().getText(), "Password");
		lp.submitButton().click();
    }

    @Then("^the user is navigated to the HomePage$")
    public void the_user_is_navigated_to_the_homepage()  {
    	Assert.assertEquals(lp.getEmail().getText(), "Password");
    }

}
