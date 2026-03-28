package pimLink;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class EmployeeRecord {
	WebDriver driver = null;
	
	@Test(priority=0)
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test (priority=1)
	public void login() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
	
	@Test(priority=2)
	public void PIM() throws InterruptedException {
		//pim
		driver.findElement(By.xpath("//span[.='PIM']")).click();
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		//enter name and save the details
		driver.findElement(By.name("firstName")).sendKeys("Arthi");
		driver.findElement(By.name("middleName")).sendKeys("Chowdary");
		driver.findElement(By.name("lastName")).sendKeys("konanki");
		driver.findElement(By.xpath("//label[.='Employee Id']/../..//input")).sendKeys("0112");
		driver.findElement(By.cssSelector("[class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Username']/../..//input")).sendKeys("arthi_k");
		driver.findElement(By.xpath("//label[.='Password']/../..//input")).sendKeys("@12Arthi");
		driver.findElement(By.xpath("//label[.='Confirm Password']/../..//input")).sendKeys("@12Arthi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.=' Save ']")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=3)
	public void Admin() throws InterruptedException {
		//admin
		driver.findElement(By.xpath("//span[.='Admin']")).click();
		//enter username
		WebElement we = driver.findElement(By.xpath("//label[.='Username']"));
		WebElement username = driver.findElement(RelativeLocator.with(By.tagName("input")).below(we));
		username.sendKeys("arthi_k");
		
		//select role
		WebElement role = driver.findElement(RelativeLocator.with(By.tagName("div")).toRightOf(username));
		role.click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='ESS']")).click();
		
		driver.findElement(By.cssSelector("[placeholder='Type for hints...']")).sendKeys("Arthi");
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Arthi Chowdary konanki']")).click();
		
		//status
		driver.findElement(By.xpath("//label[.='Status']/../..//i")).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Enabled']")).click();
		//search button
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		
		//verification
		if(driver.getPageSource().contains("Arthi")) {
			System.out.println("User ID is present");
		}
		else {
			System.out.println("User not found");
		}
	}
	
	@Test(priority=4)
	public void logout() {
		driver.findElement(By.cssSelector("[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
	}

}
