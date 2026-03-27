package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class AllLocatorOrange {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(4000);
		
		//login
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
//		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[(@type=\'submit\')]")).click();
//		Thread.sleep(4000);
		
		//recruit
		driver.findElement(By.xpath("//span[contains(@class,'oxd-text oxd-text--span oxd-main-menu-item--name') and text()='Recruitment']")).click();
//		Thread.sleep(4000);
		
		//add the info
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
//		Thread.sleep(4000);
		
		//write first name
		driver.findElement(By.className("oxd-input oxd-input--active orangehrm-firstname")).sendKeys("Arthi");
		//write last name
		driver.findElement(By.className("oxd-input oxd-input--active orangehrm-lastname")).sendKeys("Konanki");
		//add email id
		WebElement email = driver.findElement(By.className("oxd-select-text--after"));
		driver.findElement(RelativeLocator.with(By.className("input")).below(email)).sendKeys("arthi123@gmail.com");
		
		//save
	}

}
