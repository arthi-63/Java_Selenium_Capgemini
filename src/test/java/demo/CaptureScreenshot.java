package demo;

import org.testng.annotations.Test;

import com.orangehrm.GenericUtility.WebDriverGenericUtility;
import com.orangehrm.objectRepository.DashboardPage;
import com.orangehrm.objectRepository.LoginPage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {
	@Test
	public void screenShot() throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		WebDriverGenericUtility wu = new WebDriverGenericUtility(driver);
		LoginPage lp = new LoginPage(driver);
		DashboardPage dsp = new DashboardPage(driver);
		
		//creating a method for the time-stamp
		String timestamp = new SimpleDateFormat("yyyy-MM-dd[hh-mm-ss]").format(new Date());
		wu.configMaximizeBrowser();
		wu.waitForElementsToLoad(20);
		wu.navigateToUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp.login("Admin", "admin123");
		Thread.sleep(2000);
		
		//Capture screenshot of web page
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./Reports/dashboard"+timestamp+".png");
		FileHandler.copy(temp, perm);
		Thread.sleep(2000);
		
		//capture the screenshot of web element 
		WebElement recruitmentLink = dsp.getRecruitmentLink();
		File tempsrc = recruitmentLink.getScreenshotAs(OutputType.FILE);
		File permTrg = new File ("./Reports/recruitment.png");
		FileHandler.copy(tempsrc, permTrg);
	}

}
