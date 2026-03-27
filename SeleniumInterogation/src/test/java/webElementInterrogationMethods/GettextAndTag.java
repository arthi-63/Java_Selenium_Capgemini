package webElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextAndTag {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		//locating the link and printing the text
		WebElement abtLink = driver.findElement(By.id("navbarDropdown"));
		System.out.println("Name of the link is " + abtLink.getText());
		
		//fetching the tag name
		System.out.println("The tagname is " + abtLink.getTagName());
				
	}

}
