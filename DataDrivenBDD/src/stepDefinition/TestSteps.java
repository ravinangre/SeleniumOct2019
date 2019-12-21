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
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		System.out.println("User navigate to Login Page");

	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(arg1);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(arg2);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Succesfully logged in gmail");
	}
	@Then("^close the browsr$")
	public void close_the_browsr( ) {
		System.out.println("successfully quite the browser");
		driver.close();
	}
}
