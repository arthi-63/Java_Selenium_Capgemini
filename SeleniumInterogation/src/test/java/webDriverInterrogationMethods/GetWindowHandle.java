package webDriverInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//fetching the 32 char unique window id
		System.out.println(driver.getWindowHandle());
		
		//refreshing the page
//		driver.navigate().refresh();
//		Thread.sleep(2000);
		
		//c the session id
		System.out.println(driver.getWindowHandle());
		driver.quit();
	}

}
