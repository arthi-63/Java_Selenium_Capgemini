package handlingFileUploadPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriPopup {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[.='  I have work experience (excluding internships)']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\hp\\Downloads\\ARTHI Resume.pdf");
	}

}
