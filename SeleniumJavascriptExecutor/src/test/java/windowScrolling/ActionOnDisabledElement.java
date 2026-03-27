package windowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnDisabledElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/javase-jdk25-doc-downloads.html");
		
		//click on the link
		driver.findElement(By.linkText("jdk-25.0.2_doc-all.zip")).click();
		Thread.sleep(2000);
		
		//locate the disabled element
		WebElement disabledBtn = driver.findElement(By.linkText("Download jdk-25.0.2_doc-all.zip"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", disabledBtn);
	}

}
