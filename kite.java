package basicprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class kite {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("XA0634");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Gujar131!");
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))).sendKeys("170615");
	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("170615");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
}
}
