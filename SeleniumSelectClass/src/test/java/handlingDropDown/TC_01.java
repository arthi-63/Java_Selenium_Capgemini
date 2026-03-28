package handlingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		WebElement singleSelect = driver.findElement(By.id("oldSelectMenu"));
		
		//select class ogj
		Select sel = new Select (singleSelect);
		//verify
		System.out.println(sel.isMultiple());
		
		//next dropdown
		Select se = new Select(driver.findElement(By.id("cars")));
		System.out.println(se.isMultiple());
	}

}
