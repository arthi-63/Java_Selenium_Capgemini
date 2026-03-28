package demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class LoginUsingXmlOR {
	@Test
	public void login() throws SAXException,IOException,ParserConfigurationException {
		//read data from xml file
		Document file = DocumentBuilderFactory.newInstance().newDocumentBuilder()
		.parse(new File("./src/main/resources/DemoObjectRepository/LoginPage.xml"));
		
		//fetching the string value
		String username = file.getElementsByTagName("UsernameField").item(0).getTextContent();
		String password = file.getElementsByTagName("passwordField").item(0).getTextContent();
		String loginBtn = file.getElementsByTagName("loginButton").item(0).getTextContent();
		//spliting the locator and value
		String userloc = username.split(":")[0];
		String userlocValue = username.split(":")[1];
		String passwordloc = password.split(":")[0];
		String passwordlocValue = password.split(":")[1];
		String loginloc = loginBtn.split(":")[0];
		String loginlocValue = loginBtn.split(":")[1];
		//testscript
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//username
		if(userloc.equals("name")) {
			driver.findElement(By.name(userlocValue)).sendKeys("Admin");
		}
		//password
		if(passwordloc.equals("name")) {
			driver.findElement(By.name(passwordlocValue)).sendKeys("admin123");
		}
		//login button
		if(loginloc.equals("cssSelector")) {
			driver.findElement(By.cssSelector(loginlocValue)).click();
		}
	}

}
