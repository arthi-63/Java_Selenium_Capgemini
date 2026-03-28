package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement un = driver.findElement(By.xpath("//input[starts-with (@name,\"user\")]"));
		un.sendKeys("Admin");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(un)).sendKeys("admin123");
		
		//login
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		//click on profile
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='oxd-userdropdown-name']")).click();
		
		//click on change password
		driver.findElement(By.xpath("//a[.='Change Password']")).click();
		Thread.sleep(2000);
		
		//navigate back and verify
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//navigate forward and verify
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//refresh the page
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//validate the current url
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
		
	}

}
