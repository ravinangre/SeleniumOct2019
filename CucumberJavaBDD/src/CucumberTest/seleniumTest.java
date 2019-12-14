package CucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {
	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\chromedriver.exe");
		driver = new ChromeDriver();
		 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
 
        driver.get("http://www.facebook.com");
 
        
 
        // Enter Username on the element found by above desc.
 
        driver.findElement(By.id("email")).sendKeys("9423111564"); 
 
        
 
        driver.findElement(By.id("pass")).sendKeys("7875888498");
 
        // Now submit the form. WebDriver will find the form for us from the element 
 
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("Login Successfully");
 
        // Find the element that's ID attribute is 'account_logout' (Log Out)
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
        
        driver.findElement (By.xpath("//span[contains(text(),'Log Out')]")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("LogOut Successfully");
 
        // Close the driver
 
        driver.quit();
 
 }

	}
