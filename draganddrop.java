package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/drag_drop.html");					
	     driver.manage().window().maximize();
				
		        WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));					
		      
		        Actions act=new Actions(driver);					
		       	
		        act.dragAndDropBy(From,135, 40).build().perform();		
		 }		

	}

