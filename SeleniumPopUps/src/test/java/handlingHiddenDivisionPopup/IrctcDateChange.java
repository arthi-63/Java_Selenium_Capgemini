package handlingHiddenDivisionPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcDateChange {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='OK']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[class='ng-tns-c69-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("11")).click();
	}

}
