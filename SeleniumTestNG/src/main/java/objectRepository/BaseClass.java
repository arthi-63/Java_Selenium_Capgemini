package objectRepository;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	//public is imp since we are going to inherit to other package
	public WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      
	}
}
