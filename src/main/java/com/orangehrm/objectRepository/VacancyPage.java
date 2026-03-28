package com.orangehrm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VacancyPage {
	WebDriver driver;
	
	public VacancyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="[class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement vacancy;

	public WebElement getVacancy() {
		return vacancy;
	}

	public void clickVacancy() {
		getVacancy().click();
	}
	
	

}
