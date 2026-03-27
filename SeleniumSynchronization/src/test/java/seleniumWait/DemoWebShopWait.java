package seleniumWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopWait {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		driver.findElement(By.xpath("//a[.='YouTube']")).click();
		
		Set<String> allWindow = driver.getWindowHandles();
		allWindow.remove(driver.getWindowHandle());
		for(String child : allWindow) {
			driver.switchTo().window(child);
			if(driver.getCurrentUrl().contains("youtube")) {
				System.out.println(driver.getTitle());
			}
			if (!child.equals(allWindow)){
				driver.close();
			}
		}
		
	}

}
