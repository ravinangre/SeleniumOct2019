package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {

		public static WebDriver driver;
		@Given("^User is on Home Page$")
		public void user_is_on_Home_Page() throws Throwable {
			System.setProperty("webdriver.chrome.driver","I:\\chromedriver.exe");
			driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://www.facebook.com");
		}

		@When("^User Navigate to LogIn Page$")
		public void user_Navigate_to_LogIn_Page() throws Throwable {
		    System.out.println("Username Navigate to Login Page");
		}

		@When("^User enters UserName and Password$")
		public void user_enters_UserName_and_Password() throws Throwable {
			driver.findElement(By.id("email")).sendKeys("9423111564"); 
	        driver.findElement(By.id("pass")).sendKeys("7875888498");
	        driver.findElement(By.xpath("//input[@value='Log In']")).click();
		}

		@Then("^Message displayed Login Successfully$")
		public void message_displayed_Login_Successfully() throws Throwable {
			System.out.println("Login Successfully");
			Thread.sleep(4000);
		}

		@When("^User LogOut from the Application$")
		public void user_LogOut_from_the_Application() throws Throwable {
			Thread.sleep(3000);
			 driver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
		        
		     driver.findElement (By.xpath("//span[contains(text(),'Log Out')]")).click();
		 
		}

		@Then("^Message displayed LogOut Successfully$")
		public void message_displayed_LogOut_Successfully() throws Throwable {
			 System.out.println("LogOut Successfully");
		        driver.quit();
		}

	}

