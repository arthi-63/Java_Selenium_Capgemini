package weeklyAssesment;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_SL_02 {
	WebDriver driver= null;
	@Test(priority=0)
	public void login(){
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/");
		//login
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test(priority=1)
	public void Product() {
		driver.findElement(By.cssSelector("[class='product_sort_container']")).click();
		WebElement sort = driver.findElement(By.cssSelector("[class='product_sort_container']"));
		Actions act = new Actions(driver);
		act.moveToElement(sort).click().pause(Duration.ofSeconds(4)).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER);
		
		//lowest product
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.cssSelector("[class='shopping_cart_link']")).click();
		//verify
		if(driver.getPageSource().contains("Sauce Labs Onesie")) {
			Reporter.log("Product is added", true);
		}
		else {
			Reporter.log("Product is not added",true);
		}
		
		//checkout
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Ark");
		driver.findElement(By.id("last-name")).sendKeys("konanki");
		driver.findElement(By.id("postal-code")).sendKeys("60032");
		driver.findElement(By.id("continue")).click();
	}
	
	@Test(priority=2)
	public void order() {
		if(driver.getPageSource().contains("Sauce Labs Onesie")){
			Reporter.log("Products verified", true);
		}
		else {
			Reporter.log("Wrong product",true);
		}
		
		String Expectedproduct="Sauce Labs Onesie";
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(driver.getPageSource().contains("Sauce Labs Onesie"), Expectedproduct);
		
		//complete product
		driver.findElement(By.id("finish")).click();
	}
	
	@Test(priority=3)
	public void logOut() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		driver.close();
	}

}
