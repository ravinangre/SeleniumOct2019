package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharayu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		driver.manage().window().maximize();
	    Actions actions = new Actions(driver);
	 
	    WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
	    actions.contextClick(btnElement).perform();
	    System.out.println("Right click Context Menu displayed");   
	    WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));  
	    elementOpen.click(); 
	    driver.switchTo().alert().accept();
	    System.out.println("Right click Alert Accepted");
	    driver.close();
	}

}
