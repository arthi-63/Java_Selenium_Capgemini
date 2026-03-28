package HandlingsPops;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@data-index='3']")).click();
		Thread.sleep(3000);
		
		Set<String> allWindowId = driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
		allWindowId.remove(parentId);
		
		for(String s : allWindowId) {
			driver.switchTo().window(s);
		}
		driver.findElement(By.xpath("(//input[@data-hover='Select <b>__dims__</b> from the left<br> to add to Shopping Cart'])[2]")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
