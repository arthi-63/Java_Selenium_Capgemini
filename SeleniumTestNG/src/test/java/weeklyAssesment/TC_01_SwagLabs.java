package weeklyAssesment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_01_SwagLabs {
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
	public void validate() {
		if(driver.getPageSource().contains("Swag Labs")) {
			Reporter.log("Page is loaded", true);
		}
		else {
			Reporter.log("Page is not loaded", true);
		}
		
		//add the products
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.cssSelector("[class='shopping_cart_link']")).click();
		
		//verify the cart items
		if(driver.getPageSource().contains("Sauce Labs Backpack")) {
			Reporter.log("1 item is verfied", true);
		}
		if(driver.getPageSource().contains("Sauce Labs Bike Light")) {
			Reporter.log("Cart items are verified", true);
		}
	}
	
	@Test(priority=2)
	public void checkOut() {
		//check out info
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Ark");
		driver.findElement(By.id("last-name")).sendKeys("konanki");
		driver.findElement(By.id("postal-code")).sendKeys("60032");
		driver.findElement(By.id("continue")).click();
		
		//valiadte price of complete order
		String Expectedtotal = "$43.18";
		WebElement actalTotal = driver.findElement(By.cssSelector("[class='summary_total_label']"));
		if(actalTotal.getText().contains(Expectedtotal)) {
			Reporter.log("Price total matched", true);
		}
		else {
			Reporter.log("Price not matched", true);
		}
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actalTotal.getText().contains(Expectedtotal),Expectedtotal);
	}
	
	@Test(priority=3)
	public void logOut() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		driver.close();
	}
}
