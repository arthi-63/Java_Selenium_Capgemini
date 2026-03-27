package webElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		WebElement logo = driver.findElement(By.xpath("//*[name()='svg' and @id='Layer_1']"));
		System.out.println(logo.getCssValue("font"));
		System.out.println(logo.getCssValue("fonts")); //---> no exceptions for wrong arg but doesn't give output
		System.out.println(logo.getCssValue("color"));
		System.out.println(logo.getCssValue("background-color"));
		System.out.println(logo.getCssValue("display"));
		
		WebElement download = driver.findElement(By.xpath("//span[.='Downloads']"));
		System.out.println(download.getCssValue("font-family"));
		System.out.println(download.getCssValue("color"));
		System.out.println(download.getCssValue("background-color"));
		System.out.println(download.getCssValue("display"));
	}

}
