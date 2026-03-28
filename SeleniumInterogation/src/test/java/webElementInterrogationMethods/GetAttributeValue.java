package webElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//locating search text field
		WebElement search = driver.findElement(By.id("small-searchterms"));
		
		//fetch attribute value for static attribute
		System.out.println(search.getAttribute("id")); //small-searchterms
		System.out.println(search.getDomAttribute("id")); //small-searchterms
		System.out.println(search.getDomProperty("id"));  //small-searchterms
		
		//fetching the attribute value of a dynamic attribute
		System.out.println(search.getAttribute("value"));  //Search store
		System.out.println(search.getDomAttribute("value"));//Search store
		System.out.println(search.getDomProperty("value")); //Search store
		
		Thread.sleep(2000);
		search.sendKeys("mobile");
		System.out.println(search.getAttribute("value"));   //mobile
		System.out.println(search.getDomAttribute("value"));//Search store
		System.out.println(search.getDomProperty("value")); //mobile
		
		driver.quit();
	}

}
