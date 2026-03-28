package handlingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDeslectMethids {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(5000);
		
		//locate the lostbox and creating the object
		Select sel = new Select(driver.findElement(By.id("select-multiple-native")));
		
		//select the few options
		sel.selectByContainsVisibleText("White Gold");
		sel.selectByContainsVisibleText("SanDisk");
		sel.selectByContainsVisibleText("Acer");
		sel.selectByContainsVisibleText("DANVOUY");
		Thread.sleep(3000);
		
		//deselect the options
		//by index
		sel.deselectByIndex(6);
		Thread.sleep(2000);
		
		//by value
		sel.deselectByValue("SanDisk SSD PLUS 1TB Internal SSD - SATA III 6 Gb/s");
		Thread.sleep(2000);
		
		//by visible text
		sel.deselectByVisibleText("Acer SB220Q bi 21.5 ...");
		Thread.sleep(2000);
		
		//by contains visible text
		sel.deSelectByContainsVisibleText("DANVOUY");
		Thread.sleep(2000);
		
		//select the few options
		sel.selectByContainsVisibleText("White Gold");
		sel.selectByContainsVisibleText("SanDisk");
		sel.selectByContainsVisibleText("Acer");
		sel.selectByContainsVisibleText("DANVOUY");
		
		//deselect all
		sel.deselectAll();
	}

}
