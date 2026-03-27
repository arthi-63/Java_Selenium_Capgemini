package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatTC_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("gLFyf")).sendKeys("Automation");
		Thread.sleep(2000);
		
		//go to amazon
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		//search tools in amazon
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tools");
		Thread.sleep(2000);
		
		//refresh the page
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//navigate back to google
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
	}

}
