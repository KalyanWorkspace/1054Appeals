package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class TestBase {
	
	public  Properties OR =null;
	public static WebDriver driver = null;
	
	
	
	public  WebDriver initializeDriver() throws IOException
	{
		OR = new Properties();
		FileInputStream fis = new FileInputStream("C:\\WorkSpace\\bdd\\SQAConnect\\src\\main\\java\\resources\\or.properties");	
		OR.load(fis);
		String BrowserName=OR.getProperty("browser");
		
		if (BrowserName.toUpperCase().equals("CHROME")){
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();		
			
	}
		if (BrowserName.toUpperCase().equals("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		if (BrowserName.toUpperCase().equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Drivers\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	
	
@AfterTest
public void teardown() {
	driver.close();
	driver.quit();
	driver=null;
}

}
