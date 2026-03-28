package handlingFileUploadPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(2000);
		
		//Avoiding the file upload popup
		driver.findElement(By.id("resume")).sendKeys("C:\\Users\\hp\\Downloads\\ARTHI Resume.pdf");
		
	}

}
