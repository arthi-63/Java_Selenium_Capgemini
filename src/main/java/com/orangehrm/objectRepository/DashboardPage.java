package com.orangehrm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Recruitment")
	private WebElement recruitmentLink;
	
	@FindBy(linkText = "PIM")
	private WebElement pimLink;
	
	@FindBy(css = "[class='oxd-userdropdown-name']")
	private WebElement logOutDropdown;
	
	@FindBy(linkText="Logout")
	private WebElement logoutLink;
	
	public WebElement getRecruitmentLink() {
		return recruitmentLink;
	}

	public void clickRecruitmentLink() {
		getRecruitmentLink().click();
	}

	public WebElement getPimLink() {
		return pimLink;
	}

	public void clickPimLink() {
		getPimLink().click();
	}

	public WebElement getLogOutDropDown() {
		return logOutDropdown;
	}

	public void clickLogOutDropDown() {
		getLogOutDropDown().click();
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void clickLogoutLink() {
		getLogoutLink().click();
	}
	
	public void logout() {
		clickLogOutDropDown();
		clickLogoutLink();
	}
	
}
