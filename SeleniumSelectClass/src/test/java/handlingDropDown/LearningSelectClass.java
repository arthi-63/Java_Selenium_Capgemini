package handlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectClass {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//locate the skills drop down
		WebElement dropdown = driver.findElement(By.id("Skills"));
		
		//making object for select class
		Select scl = new Select(dropdown);
		//calling select method
		//by index
		scl.selectByIndex(9);
		Thread.sleep(2000);
		
		//by value attribute
		scl.selectByValue("Engineering");
		Thread.sleep(2000);
		
		//by visible text
		scl.selectByVisibleText("Design");
		Thread.sleep(2000);
		
		//by contains visible text
		scl.selectByContainsVisibleText("script");
		Thread.sleep(2000);
		
		//fetching the options from the dropdown
		List<WebElement> allOpt = scl.getOptions();
		for(WebElement opt : allOpt) {
			System.out.println(opt.getText());
		}
	}

}
