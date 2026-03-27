package objectRepository_pageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import objectRepository.BaseClass;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		//automatically intialize the web element
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	//business logic
	public void enterUrl(String url) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	public void enterCrendiatials(String un, String pwd) {
		Username.sendKeys(un);
		password.sendKeys(pwd);
	}
	public void clickLogin() {
		loginBtn.click();
	}

}
