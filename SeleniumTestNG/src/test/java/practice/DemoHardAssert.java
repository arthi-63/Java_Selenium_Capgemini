package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssert {
	@Test
	public void testMethod() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		String expectedTitle="Google";
		String actualTitle = driver.getTitle();
		
		//hard assertion
//		Assert.assertEquals(actualTitle, expectedTitle);
//		Assert.assertTrue(expectedTitle.equals(actualTitle));
		Assert.assertEquals(expectedTitle.equals(actualTitle), true);
	}

}
