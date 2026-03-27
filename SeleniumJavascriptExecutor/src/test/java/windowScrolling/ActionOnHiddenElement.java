package windowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnHiddenElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/javase-jdk25-doc-downloads.html");
		
		WebElement hiddenEle = driver.findElement(By.xpath(""));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("", hiddenEle);
	}

}
