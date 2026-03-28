package com.orangehrm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddVacancyPage {
	WebDriver driver;
	
	public AddVacancyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[.='Vacancy Name']/../..//input")
	private WebElement vacancyName;
	
	@FindBy(xpath="//label[.='Job Title']/../..//div[@class='oxd-select-text--after']")
	private WebElement JobTitle;
	
	@FindBy(css = "[placeholder='Type description here']")
	private WebElement descrption;
	
	@FindBy(css = "[placeholder='Type for hints...']")
	private WebElement hiringMng;
	
	@FindBy(xpath = "//label[.='Number of Positions']/../..//input")
	private WebElement NumOfPos;
	
	@FindBy(css = "[type='submit']")
	private WebElement saveBtn;

	public WebElement getVacancyName() {
		return vacancyName;
	}

	public void setVacancyName(String vacancyName) {
		getVacancyName().sendKeys(vacancyName);
	}

	public WebElement getJobTitle() {
		return JobTitle;
	}

	public WebElement getDescription() {
		return descrption;
	}

	public void setDescription(String description) {
		getDescription().sendKeys("Recruitment of technically sound engineers");
	}

	public WebElement getHiringMgr() {
		return hiringMng;
	}

	public WebElement getNumOfPos() {
		return NumOfPos;
	}

	public void setNumOfPos(String numOfPos) {
		getNumOfPos().sendKeys(numOfPos);
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void clickSaveBtn() {
		getSaveBtn().click();
	}
}
