package handlingDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		//locating the listbox
		WebElement listbox = driver.findElement(By.id("cars"));
		
		//select class object
		Select sel = new Select(listbox);
		
		//select few options
		sel.selectByVisibleText("Volvo");
		sel.selectByVisibleText("Saab");
		sel.selectByVisibleText("Audi");
		
		//verfying if all options above are selected or not
		List<WebElement> selOpt = sel.getAllSelectedOptions();
		for(WebElement opt: selOpt) {
			System.out.println(opt.getText());
		}
		driver.quit();
	}

}
