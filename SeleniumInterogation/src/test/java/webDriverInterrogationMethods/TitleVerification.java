package webDriverInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//fetching the title
		String ExpectedTitle = "Demo Web Shop";
		String title = driver.getTitle();
		
		//verification of title
		if(title.equals(ExpectedTitle)) {
			System.out.println("The navigation is successfull");
		}
		else {
			System.out.println("Naviagtion Failed");
		}
		driver.quit();
	}

}
