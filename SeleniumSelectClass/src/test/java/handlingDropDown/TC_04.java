package handlingDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_04 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		
		//click on login using invalid crenditials
		driver.findElement(By.id("username")).sendKeys("afgd");
		driver.findElement(By.id("password")).sendKeys("wertyu");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		
		//error msg validation
		if(driver.findElement(By.cssSelector("[class='alert alert-danger']")) != null) {
			System.out.println("Error msg");
		}
		else {
			System.out.println("logged login");
		}
		
		//correct crenditial for login
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[.='Log in ']")).click();
		
		//dashboard validation
		if(driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("Dashboard page");
		}
		else {
			System.out.println("Not in dashboard");
		}
		
		//employee section
		driver.findElement(By.id("menu_admin_Employees")).click();
		driver.findElement(By.xpath("//a[@href='https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees']/.. //i[@class='fa fa-users']")).click();
		
		//skills
		driver.findElement(By.id("tabEmployeeSkill")).click();
		
		//add new
		driver.findElement(By.xpath("//span[.=' Add New']")).click();
		
		WebElement empname = driver.findElement(By.xpath("//span[.='Select Employee']/parent::span/parent::div/parent::div/parent::div"));
        empname.click();
		driver.findElement(By.xpath("//textarea[@class='ant-input css-dev-only-do-not-override-240cud ant-input-outlined']")).sendKeys("Certified Data Analyst");
		
		//Cancel
		driver.findElement(By.xpath("//span[.='Cancel']")).click();
		driver.findElement(By.xpath("//span[.='IceHrm ']")).click();
		driver.findElement(By.xpath("//a[.='Sign out']")).click();
		
	}

}
