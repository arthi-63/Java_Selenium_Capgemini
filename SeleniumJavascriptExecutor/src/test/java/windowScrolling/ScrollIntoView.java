package windowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://doodles.google/");
		
		WebElement ele = driver.findElement(By.xpath("//div[.='When is your birthday?']"));
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView(false)", ele);
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}

}
