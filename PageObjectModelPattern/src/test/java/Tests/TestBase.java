package Tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver = null;
	 
	 @BeforeSuite
	 public void initialize() throws IOException{
	 
	 System.setProperty("webdriver.chrome.driver", "I:\\chromedriver.exe");
	 driver = new ChromeDriver(); 
	 driver.manage().window().maximize();
	
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com");
	 
	 }
	 
	 @AfterSuite
	 public void TeardownTest()
	    {
	        TestBase.driver.quit();
	    }
}
