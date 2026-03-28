package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	WebDriver driver;
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By tab = By.id("react-burger-menu-btn");
	By logout = By.id("logout_sidebar_link");
	
	public void enterUrl(String url) {
		driver.get(url);
	}
	
	public void clickLogout() {
		driver.findElement(tab).click();
		driver.findElement(logout).click();
	}
}
