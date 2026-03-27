package practice;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		//open link
		WebElement orange = driver.findElement(By.partialLinkText("OrangeHRM, Inc"));
		
		//capture the current window id
		String parentId = driver.getWindowHandle();
		orange.click();
		
		//getting allWindow id
		Set<String> allWindow = driver.getWindowHandles();
		allWindow.remove(parentId);
		for(String childId : allWindow) {
			driver.switchTo().window(childId);
		}
		
		//validates url
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("")) {
			System.out.println("current url contains orangehrm.com");
		}
		else {
			System.out.println("url does not contains orangehrm.com");
		}
		
		//checking if title is empty or not
		String title = driver.getTitle();
		if(title!=null) {
			System.out.println("Title is: "+title);
		}
		else {
			System.out.println("no title");
		}
		
		//close the child window id
		driver.close();
		
		//switch back to parent window
		driver.switchTo().window(parentId);
		
		//verifying the cuurent page is in login page or not
		if(driver.getCurrentUrl().contains("login")) {
			System.out.println("Login page is displayed");
		}
		else {
			System.out.println("Login page is not displayed");
		}
		
		//closing the browser
		driver.close();
		
	}
	

}
