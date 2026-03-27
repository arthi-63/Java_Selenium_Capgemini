package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttributes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'vl-flyout-nav__link-container') and @href=\"https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545\" ]")).click();
		
	}

}
