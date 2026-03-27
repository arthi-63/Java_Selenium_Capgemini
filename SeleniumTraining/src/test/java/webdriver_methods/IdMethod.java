package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
//		
//		// typing selenium in he search text fields
//		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
//		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys("maadu");
		
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bottle");
		
//		driver.get("https://www.w3schools.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("search2")).sendKeys("html");
		
//		driver.get("https://www.ebay.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("gh-ac")).sendKeys("phone");
		
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("small-searchterms")).sendKeys("book");
		
		driver.get("https://www.coursera.org/");
		Thread.sleep(2000);
		driver.findElement(By.id("search-autocomplete-input")).sendKeys("java");
	}

}
