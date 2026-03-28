package handlingJavascriptPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the web page
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		//search the dress 
		driver.findElement(By.cssSelector("[class='desktop-searchBar']")).sendKeys("dress");
		driver.findElement(By.cssSelector("[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		Thread.sleep(2000);
		
		//click on to the dress
		driver.findElement(By.cssSelector("[title='Marks & Spencer Girls Tie-Dye Printed Fit & Flare Dress']")).click();
		Thread.sleep(2000);
		
		//switching the control to child window id to click wishlist
		String parentId = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		allWindow.remove(parentId);
		
		for(String childId : allWindow) {
			driver.switchTo().window(childId);
		}
		Thread.sleep(2000);
		
		//click on wishlist
		driver.findElement(By.xpath("//span[.='WISHLIST']")).click();
		Thread.sleep(2000);
		
		//login page verification
		WebElement login = driver.findElement(By.cssSelector("[class='img-responsive preLoad loaded']"));
		
		if(login.isDisplayed()) {
			System.out.println("Test case: pass");
		}
		else {
			System.out.println("Test case: fail");
		}
		
	}

}
