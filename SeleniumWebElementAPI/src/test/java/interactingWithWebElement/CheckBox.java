package interactingWithWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//select the required checkbox
		WebElement movies = driver.findElement(By.id("checkbox2"));
		movies.click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox3")).click();
		Thread.sleep(2000);
		
		//deselect 1 checkbox
		movies.click();
		
	}

}
