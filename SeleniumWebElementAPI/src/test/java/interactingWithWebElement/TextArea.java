package interactingWithWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextArea {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//entering the first name
		WebElement firstName = driver.findElement(By.cssSelector("[placeholder='First Name']"));
		firstName.sendKeys("Arthi");
		Thread.sleep(2000);
		
		//entering the last name
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Konanki");
		Thread.sleep(2000);
		
		//clearing the last name
		firstName.clear();
		
		//re entering new first name
		firstName.sendKeys("Sai");
		
	}

}
