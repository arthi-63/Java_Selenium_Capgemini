package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='✕']")).click();
//		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@href=\"/aw-trend-base-at-store?param=987541&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIkZhc2hpb24iXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19fX19\"]")).click();
	
		driver.get("https://demoapps.qspiders.com/ui/login1.0?sublist=0&scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\'Username:\']")).sendKeys("user");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pass");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

}
