package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.FbHomePage;
import Pages.FbLoginPage;

public class FbLoginTest extends TestBase {
	@Test
	 public void init() throws Exception{
	 
	 //driver.get("https://www.facebook.com");
	 FbLoginPage loginpage = PageFactory.initElements(driver, FbLoginPage.class);
	 loginpage.setEmail("9423111564");
	 loginpage.setPassword("7875888498");
	 loginpage.clickOnLoginButton();
	 
	 FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
	 homepage.clickOnProfileDropdown();
	 homepage.verifyLoggedInUserNameText();
	 homepage.clickOnLogoutLink(); 
	 }
}
