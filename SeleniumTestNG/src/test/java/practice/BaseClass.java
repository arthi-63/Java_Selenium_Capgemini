package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class BaseClass {
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("----Executing suite and connecting to dastabase-------", true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("----Executing system Test case-------", true);
	}
	
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browser) {
		Reporter.log("----Executing addToCartTest class-------", true);
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		options.addArguments("--incognito");
//		driver = new ChromeDriver();
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		else {
			System.out.println("Give proper browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//login with valid crenditials
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("----Executing addToCartTest class methods-------", true);
	}
	
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("----Executing addToCartTest class methods completed-------", true);
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("----Executing Test-------", true);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		Reporter.log("Logouted out successfully", true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("----Executing Test-------", true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("----Executing Test-------", true);
	}

}
