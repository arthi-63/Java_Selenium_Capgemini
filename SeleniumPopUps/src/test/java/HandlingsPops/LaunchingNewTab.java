package HandlingsPops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingNewTab {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		
		//triggering the new tab browser window and parallely switching the tool control to new tabl
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://github.com/");
	}

}
