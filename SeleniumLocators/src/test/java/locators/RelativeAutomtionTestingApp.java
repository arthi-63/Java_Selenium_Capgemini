package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeAutomtionTestingApp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("hhttps://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		// clicking the drop down
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.linkText("WebTable"))).click();
		
		WebElement FirstNameTF = driver.findElement(By.cssSelector("[placeholder='First Name']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(FirstNameTF, 100)).sendKeys("check");
	}

}
