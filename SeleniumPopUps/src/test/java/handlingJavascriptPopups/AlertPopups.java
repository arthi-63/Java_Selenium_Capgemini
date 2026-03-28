package handlingJavascriptPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {
	public static void main(String[] args) throws InterruptedException {
		
		// handling one single option pop-up
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		//click on the button to trigger the popup
		driver.findElement(By.cssSelector("[class='btn btn-danger']")).click();
		Thread.sleep(2000);
		
		//handling the popup
//		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}

}
