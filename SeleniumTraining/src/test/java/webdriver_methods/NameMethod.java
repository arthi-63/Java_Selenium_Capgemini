package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(8000);
		//locating the name text field
		driver.findElement(By.name("username")).sendKeys("Admin");
		//locating the password text field
		driver.findElement(By.name("password")).sendKeys("Admin123");
		
	}

}
