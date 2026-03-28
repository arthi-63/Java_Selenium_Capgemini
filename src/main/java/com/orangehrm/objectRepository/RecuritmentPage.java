package com.orangehrm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecuritmentPage {
	WebDriver driver;
	
	public RecuritmentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Vacancies")
	private WebElement vacancyLink;

	public WebElement getVacancyLink() {
		return vacancyLink;
	}
	public void clickVacancyLink() {
		getVacancyLink().click();
	}
	
	//add
	@FindBy (css="[class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addBtn;
	
	public WebElement getAddBtn() {
		return addBtn;
	}
	public void clickAdd() {
		getAddBtn().click();
	}
	
	//firstname
	@FindBy(css="[placeholder='First Name']")
	private WebElement firstName;
	
	//middle name
	@FindBy(css="[placeholder='Middle Name']")
	private WebElement middleName;
	
	//last name
	@FindBy(css="[placeholder='Last Name']")
	private WebElement lastName;
	
	//email
	@FindBy(xpath="//label[.='Email']/../..//input")
	private WebElement email;
	
	//contact Num
	@FindBy(xpath="//label[.='Contact Number']/../..//input")
	private WebElement contactNum;
	
	//resume
	@FindBy(css="[type='file']")
	private WebElement resume;
	
	//save button
	@FindBy(css="[type='submit']")
	private WebElement resSubmit;
	
	//candidate btn
	@FindBy(xpath="//a[.='Candidates']")
	private WebElement candidateBtn;
	
	//Enter candidate name
	@FindBy(css="[placeholder='Type for hints...']")
	private WebElement enterName;
	
	//search
	@FindBy(css="[type='submit']")
	private WebElement search;

	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}
	public WebElement getMiddleName() {
		return middleName;
	}
	public void setMiddleName(WebElement middleName) {
		this.middleName = middleName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getContactNum() {
		return contactNum;
	}
	public void setContactNum(WebElement contactNum) {
		this.contactNum = contactNum;
	}
	public WebElement getResume() {
		return resume;
	}
	public void setResume(WebElement resume) {
		this.resume = resume;
	}
	public WebElement getResSubmit() {
		return resSubmit;
	}
	public void setResSubmit(WebElement resSubmit) {
		this.resSubmit = resSubmit;
	}
	public WebElement getCandidateBtn() {
		return candidateBtn;
	}
	public void setCandidateBtn(WebElement candidateBtn) {
		this.candidateBtn = candidateBtn;
	}
	public WebElement getEnterName() {
		return enterName;
	}
	public void setEnterName(WebElement enterName) {
		this.enterName = enterName;
	}
	public WebElement getSearch() {
		return search;
	}
	public void setSearch(WebElement search) {
		this.search = search;
	}
	
	
	
}
