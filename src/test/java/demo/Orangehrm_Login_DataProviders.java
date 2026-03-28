package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.objectRepository.LoginPage;

public class Orangehrm_Login_DataProviders {
	WebDriver driver;
	@DataProvider(name="LoginData")
	Object[][]getCredentials(){
		return new Object[][] {
			{"Admin","admin123"}
		};
	}
	
	@Test(dataProvider="LoginData")
	public void login(String user, String pass) {
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		LoginPage lp = new LoginPage(driver);
		lp.login(user, pass);
	}

}
