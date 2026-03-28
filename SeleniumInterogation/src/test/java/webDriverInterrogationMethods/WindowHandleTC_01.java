package webDriverInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTC_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//click on  links
		String parentId = driver.getWindowHandle();
		System.out.println("this is parent id " + parentId);
		
		String fbString ="", xString ="";
		
		//verify the window id for facebook
		for(String s: driver.getWindowHandles()) {
			driver.findElement(By.xpath("//a[.='Facebook']")).click();
			Thread.sleep(2000);
			if(s.equals(parentId)) {
				fbString = s;
				break;
			}
		}
		System.out.println("Facebook id"+fbString);
		
		//verify the window id for twitter
		for(String s: driver.getWindowHandles()) {
			driver.findElement(By.xpath("//a[.='Twitter']")).click();
			Thread.sleep(2000);
			if(!s.equals(parentId)&&!s.equals(fbString)) {
				xString=s;
				break;
			}
		}
		System.out.println("Twitter id "+ xString);
	}

}
