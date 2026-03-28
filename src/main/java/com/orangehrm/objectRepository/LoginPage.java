package com.orangehrm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

@FindBy(name="username")
private WebElement userName;

@FindBy(name="password")
private WebElement passWord;

@FindBy(css="[type='submit']")
private WebElement loginBtn;

@FindBy(xpath="//p[.='Forgot your password? ']")
private WebElement forgotPwd;

@FindBy(xpath="[href=\'https://www.linkedin.com/company/orangehrm/mycompany/\']")
private WebElement linkedLn;


@FindBy(xpath="[href=\'https://www.facebook.com/OrangeHRM/\']")
private WebElement fblink;

@FindBy(xpath="[href=\'https://twitter.com/orangehrm?lang=en\']")
private WebElement xlink;

@FindBy(xpath="[href=\'https://www.youtube.com/c/OrangeHRMInc\']")
private WebElement youtube;


public WebElement getuserName() {
	return userName;
}

public void setuserName(String validuserName) {
	getuserName().sendKeys(validuserName);
}
public WebElement getPassword() {
	return passWord;
}
public void setPassword(String validpassWord) {
	getPassword().sendKeys(validpassWord);
}
public WebElement getLoginBtn() {
	return loginBtn;
}
public void clickLoginBtn() {
	getLoginBtn().click();
}
public WebElement getForgetPwd() {
	return forgotPwd;
}
public void clickForgetPwd() {
	getForgetPwd().click();
}
public WebElement getLinkedIn() {
	return linkedLn;
}
public void clickLinkedIn() {
	getLinkedIn().click();
}
public WebElement getFB() {
	return fblink;
}
public void clickX() {
	getX().click();
}
public WebElement getX() {
	return xlink;
}
public void clickyoutube() {
	getyoutube().click();
}
public WebElement getyoutube() {
	return youtube;
}

//Business logic- what action to perform in this webelemnt
//Login
public void login(String validUserName, String ValidPassword) {
	setuserName(validUserName);
	setPassword(ValidPassword);
	clickLoginBtn();
}
}
