package estimates;

import java.io.IOException;
import java.util.Base64;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class DashBoardTest extends TestBase{
	public static Logger log = LogManager.getLogger(TestBase.class.getName());
	@Test
	public void LoginTest() throws IOException {
		
		driver = initializeDriver();
		driver.get(OR.getProperty("URL"));
		
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(OR.getProperty("email"));
		lp.getPassword().sendKeys(OR.getProperty("password"));
		
		log.info("Successful");
	}
}
