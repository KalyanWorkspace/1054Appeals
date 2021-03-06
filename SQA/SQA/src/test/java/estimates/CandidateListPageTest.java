package estimates;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class CandidateListPageTest extends TestBase {
	public static Logger log = LogManager.getLogger(TestBase.class.getName());
	
	
		@Test
		public void LoginTest() throws IOException {
			
			driver = initializeDriver();
			driver.get(OR.getProperty("URL"));
			log.info("Navigated to the URL");
			
			LoginPage lp = new LoginPage(driver);
			lp.getEmail().sendKeys(OR.getProperty("email"));
			log.info(("Entered Email"));
			
			lp.getPassword().sendKeys(OR.getProperty("password"));
			log.info(("Entered Password"));
			Assert.assertEquals(lp.getEmail().getText(), "Password");
		}

}
