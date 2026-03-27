package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXpathSurroundings {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/ecommerce?sublist=0&scenario=1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[.='RedMi']/..//input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Samsung']/..//input")).click();
	}

}
