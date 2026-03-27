package locators;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageGetAndSetPosition {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(2000);
		
		driver.manage().window().setPosition(new Point(100,100));
	}

}
