package webDriverInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleUsingSwitchTo {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		Thread.sleep(2000);
		
		Set<String> allWindow = driver.getWindowHandles();
		for(String str : allWindow) {
			driver.switchTo().window(str);
			String title = driver.getTitle();
			Thread.sleep(2000);
			System.out.println("id "+str);
			System.out.println("title "+title);
		}
	}

}
