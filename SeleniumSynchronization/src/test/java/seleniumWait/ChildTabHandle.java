package seleniumWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildTabHandle {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		
		//open the another tab
		driver.findElement(By.linkText("Open In New Tab")).click();
		
		//switch control to child tab
		Set<String> allWindow = driver.getWindowHandles();
		allWindow.remove(driver.getWindowHandle());
		for(String child : allWindow) {
			driver.switchTo().window(child);
			driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		}
		
	}

}
