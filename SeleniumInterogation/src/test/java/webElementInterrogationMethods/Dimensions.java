package webElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimensions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//locate the search button
		WebElement searchBtn = driver.findElement(By.id("twotabsearchtextbox"));
		Dimension dims = searchBtn.getSize();
		System.out.println("The dimensions of the search button is "+ dims);
		
		//fetch the height
		System.out.println(dims.getHeight());
		System.out.println(dims.height);
		
		//fetch the width
		System.out.println(dims.getWidth());
		System.out.println(dims.width);
		System.out.println(searchBtn.getCssValue("height"));
	}

}
