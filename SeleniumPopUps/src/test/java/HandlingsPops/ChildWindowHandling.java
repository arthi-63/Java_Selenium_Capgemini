package HandlingsPops;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser");
		Thread.sleep(2000);
		
		//click on view more of laptop
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		
		//switching the tool control to child window to perform actions on the web element
		String parentId = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		allWindows.remove(parentId);
		
		for(String childId : allWindows) {
			//switching the tool control to the child window
			driver.switchTo().window(childId);
		}
		
		//click on add to cart in child window
		WebElement addToCart = driver.findElement(By.tagName("button"));
		addToCart.click();
		addToCart.click();
		Thread.sleep(2000);
		
		//click on cart logo
		WebElement cartLogo = driver.findElement(By.xpath("//*[local-name()='svg']"));
		cartLogo.click();
		Thread.sleep(2000);
		
		//verify the shopping cart
		WebElement shoppingCart = driver.findElement(By.tagName("h2"));
		if(shoppingCart.isDisplayed()) {
			System.out.println("Test case status: pass");
		} else {
			System.out.println("Test case: fail");
		}
		
		//close the window
		driver.close();
	}

}
