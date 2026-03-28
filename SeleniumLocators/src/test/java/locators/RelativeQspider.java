package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeQspider {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Arthi");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(RelativeLocator.with(By.tagName("input")).below(name));
		email.sendKeys("arthi123@gmail.com");
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
		pass.sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(pass)).click();
		
		
	}

}
