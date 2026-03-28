package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		//enter username and pass
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		//login
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
		//go to admin
		driver.findElement(By.xpath("//span[.='Admin']")).click();
		
		//adding the user
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		//user role dropdown
		driver.findElement(By.xpath("//label[.='User Role']/../..//div[@class='oxd-select-text oxd-select-text--active']")).click();
		
		//select admin role
		driver.findElement(By.xpath("//label[.='User Role']/../..//div[@class='oxd-select-text-input']")).click();
		
		
	}

}
