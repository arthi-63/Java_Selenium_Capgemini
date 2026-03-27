package handlingHiddenDivisionPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraHiddenDIvisionPopup {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class='desktop-searchBar']")).sendKeys("dress");
		driver.findElement(By.cssSelector("[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		
		//to stop animation 
		//go to sources and press f8 and inspect
	}

}
