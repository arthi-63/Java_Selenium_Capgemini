package com.orangehrm.GenericUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverGenericUtility {
	WebDriver driver;
	WebDriverWait wait;
	
	public WebDriverGenericUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	//maximaize
	public void configMaximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	//minimize
	public void configMinimizeBrowser() {
		driver.manage().window().minimize();
	}
	
	public void configFullscreenBrowser() {
		driver.manage().window().fullscreen();
	}
	
	//manage
	//get size
	public void fetchBrowserSize() {
		Dimension dim = driver.manage().window().getSize();
	}
	
	//get size
	public void configBrowserSize(int width, int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}
	
	//get position
	public void fetchBrowserCoordinates() {
		Point point = driver.manage().window().getPosition();
	}
	
	//set position
	public void configBrowserCoordinates(int x, int y) {
		driver.manage().window().setPosition(new Point(x, y));
	}
	
	//navigate
	//url
	public void navigateToUrl(String fullUrl) {
		driver.navigate().to(fullUrl);
	}
	
	//forward
	public void navigateForward() {
		driver.navigate().forward();
	}
	
	//back
	public void navigateBackward() {
		driver.navigate().back();
	}
	
	//refresh
	public void refreshCurrentPage() {
		driver.navigate().refresh();
	}
	
	//Get methods
	//get url
	public void getUrl(String url) {
		driver.get(url);
	}
	
	//get title
	public String fetchApplicationTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	//get current url
	public String fetchApplicationUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	//close
	public void closingTab() {
		driver.close();
	}
	
	//quit
	public void closingBrowserWindow() {
		driver.quit();
	}
	
	//implicit wait
	public void waitForElementsToLoad(int i) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));
	}
	
	//explicit wait
	public void waitTillElementToBeClickable(WebElement element, long maximumTimeToWait) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(maximumTimeToWait));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitTillElementIsVisible(WebElement element, long maximumTimeToWait) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(maximumTimeToWait));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//popups
	//alert
	public void clickOnAccept() {
		driver.switchTo().alert().accept();
	}

	public void clickOnDismiss() {
		driver.switchTo().alert().dismiss();
	}
	
	public void typeMsgInJavascriptPopup(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	
	public String fetchJSPopupMsg() {
		String msg = driver.switchTo().alert().getText();
		return msg;
	}
	
	//child window switching
	public void windowSwitchingByTitle(String childAppTitle) {
		String parentId = driver.getWindowHandle();
		Set<String> childIds = driver.getWindowHandles();
		childIds.remove(parentId);
		for(String child: childIds) {
			driver.switchTo().window(child);
			String title = driver.getTitle();
			if(title.contains(childAppTitle)) {
				break;
			}
		}
	}
	
	public void windowSwitchingByUrl(String childAppTitle) {
		String parentId = driver.getWindowHandle();
		Set<String> childIds = driver.getWindowHandles();
		childIds.remove(parentId);
		for(String child: childIds) {
			driver.switchTo().window(child);
			String title = driver.getCurrentUrl();
			if(title.contains(childAppTitle)) {
				break;
			}
		}
	}
	
	//Iframe
	public void switchToFrameByIndex(int indexNo) {
		driver.switchTo().frame(indexNo);
	}
	public void switchToFromByIdOrname(String idOrName) {
		driver.switchTo().frame(idOrName);
	}
	public void switchToFromByFrameElement(String frameElement) {
		driver.switchTo().frame(frameElement);
	}
	public void switchBacktheControlToPreviousFrame() {
		driver.switchTo().parentFrame();
	}
	public void switchBacktheControlToMainPage() {
		driver.switchTo().defaultContent();
	}
}
