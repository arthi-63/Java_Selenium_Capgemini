package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByAxesMakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000);
		
		// cut the pop-ups
		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("")).click();
	}

}
