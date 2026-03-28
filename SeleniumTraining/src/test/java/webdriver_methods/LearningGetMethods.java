package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetMethods {
	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver = new ChromeDriver();
		
		//navigate to youtube
		driver.get("https://www.youtube.com/");
		
		//fetching the title of the webpage
		String title  = driver.getTitle();
		System.out.println(title);
		
		//naviagte to amazon
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}

}
