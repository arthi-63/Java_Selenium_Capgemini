package webDriverInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		
		//fetching the window id of the parent class
		String parentId = driver.getWindowHandle();
		System.out.println("This is the window id of the parent class "+parentId);
		
		//click on a tab to get child window popup
		driver.findElement(By.xpath("//h2[.='Watches']/..//button")).click(); //--> it will launch another popup, it is considered as diff web browser and has diff window id.
		Thread.sleep(2000);
		
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println("Window is of both parent and child windows "+allWindowId);
		
		//remove the parent id from all the windows
		allWindowId.remove(parentId);
		//child id is still in set<String>
		System.out.println(allWindowId);
		
		for(String string : allWindowId) {
			System.out.println("Window id of child window "+string);
		}
	}

}
