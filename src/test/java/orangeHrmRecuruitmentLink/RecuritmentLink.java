package orangeHrmRecuruitmentLink;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RecuritmentLink {
	WebDriver driver = null;
	
	@Test(priority=0)
	public void launch() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
	
	@Test(priority=1)
	public void Recuritment() {
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		//enter name
		driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("sai");
		driver.findElement(By.cssSelector("[placeholder='Middle Name']")).sendKeys("krish");
		driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("K");
		//dropdown
		driver.findElement(By.cssSelector("[class='oxd-select-text oxd-select-text--active']")).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Software Engineer']")).click();
		//email
		driver.findElement(By.xpath("(//input[@placeholder='Type here'])[1]")).sendKeys("sai123@gmail.com");
		//contact num
		driver.findElement(By.xpath("(//label[.='Contact Number']/../..//input")).sendKeys("9944140987");
		//upload file
		driver.findElement(By.cssSelector("[type='file']")).sendKeys("C:/Users/hp/Documents/cr_561.pdf");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	
	@Test(priority=2)
	public void candidate() throws InterruptedException {
		driver.findElement(By.xpath("//a[.='Candidates']")).click();
		
		//job title
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Chief Executive Officer']")).click();
		//vacancy
		driver.findElement(By.xpath("//label[.='Vacancy']/../..//i")).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Senior QA Lead']")).click();
//		//hiring manager
//		driver.findElement(By.xpath("//label[.='Hiring Manager']/../..//i")).click();
//		driver.findElement(By.xpath("//div[@role='option']//span[text()='Rahul Das']")).click();
		//status
		driver.findElement(By.xpath("//label[.='Status']/../..//i")).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Interview Passed']")).click();
		//candidate name
		driver.findElement(By.cssSelector("[placeholder='Type for hints...']")).sendKeys("Sai");
		driver.findElement(By.xpath("//div[@role='option']//span[text()='sai krish K']")).click();
		Thread.sleep(2000);
		//search
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
	@Test(priority=3)
	public void verify() {
		if(driver.getPageSource().contains("sai")) {
			System.out.println("User ID is found");
		}
		else {
			System.out.println("User not found");
		}
	}
	
	@Test(priority=4)
	public void logOut() {
		driver.findElement(By.cssSelector("[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
	}

}
