package demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.GenericUtility.FileUtility;
import com.orangehrm.GenericUtility.WebDriverGenericUtility;
import com.orangehrm.objectRepository.LoginPage;

public class LoginTest {
	@Test
	public void login() throws IOException {
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/login_report.html");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("Login Test");
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverGenericUtility wu = new WebDriverGenericUtility(driver);
		FileUtility fu = new FileUtility();
		LoginPage lp = new LoginPage(driver);
		wu.configMaximizeBrowser();
		wu.waitForElementsToLoad(20);
		
		String urlPath = fu.getPropertyKeyValue("url");
		String un = fu.getPropertyKeyValue("username");
		String pass = fu.getPropertyKeyValue("password");
		
		//Navigating the application
		wu.navigateToUrl(urlPath);
		test.log(Status.INFO, "Navigating to orangeHRM login page");
		//test.info("Navigating tomorangeHRM login page");
		lp.login(un,pass);
		
		test.log(Status.PASS, "Login Sucessful");
		//test.pass("Login successful");
		extent.flush();
	}

}
