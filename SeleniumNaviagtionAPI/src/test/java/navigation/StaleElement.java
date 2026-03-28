package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement searchTF = driver.findElement(By.id("small-searchterms"));
		searchTF.sendKeys("Mobile");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		searchTF.sendKeys("MObile");
	}
	
	

}
