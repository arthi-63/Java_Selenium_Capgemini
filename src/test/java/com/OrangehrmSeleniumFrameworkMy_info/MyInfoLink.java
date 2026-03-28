package com.OrangehrmSeleniumFrameworkMy_info;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyInfoLink {
	@Test
	public void logIn() throws InterruptedException {
		//launching browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
		//my info
		driver.findElement(By.xpath("//span[.='My Info']")).click();
		Thread.sleep(2000);
		
		//adding info
		Thread.sleep(2000);
		
	}

}
