package genericUtility;

import org.testng.annotations.Test;
import objectRepository.BaseClass;
import objectRepository.LoginPage;
import objectRepository.LogoutPage;

public class LogTest extends BaseClass {
	
	@Test
	public void logIn(){
		
		LoginPage lp = new LoginPage(driver);
		LogoutPage lo = new LogoutPage(driver);
		
		//Navigating to the application
  		lp.enterUrl("https://www.saucedemo.com/");
		
		//login action
		lp.enterCrendentials("standard_user", "secret_sauce");
		lp.clickLogin();
		lo.clickLogout();
		driver.quit();
		
	}

}
