package swagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository_pageFactory.LoginPage;

public class LoginPageFactoryTest {
	
	@Test
	public void login() {
		WebDriver driver;
		
		driver=new ChromeDriver();
		LoginPage lp = new LoginPage(driver);
		lp.enterUrl("https://www.saucedemo.com/");
		lp.enterCrendiatials("standard_user", "secret_sauce");
		lp.clickLogin();
	}

}
