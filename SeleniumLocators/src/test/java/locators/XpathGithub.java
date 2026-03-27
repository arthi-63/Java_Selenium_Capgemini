package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathGithub {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='flex-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='query-builder-test']")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ActionListItem-label text-normal']")).click();
	}

}
