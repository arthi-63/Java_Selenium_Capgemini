package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Practice {

	@Test
	public void readData() throws IOException{
		FileInputStream fis = new FileInputStream("./src/test/resources/orangehrm_commonData/CommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String URL = prop.getProperty("url");
		String Browser = prop.getProperty("browser");
		String ValidUsername = prop.getProperty("username");
		String ValidPassword = prop.getProperty("password");
		
		System.out.println("the default browser for testing is "+ Browser);
		System.out.println("the default url for testing is "+ URL);
		System.out.println("the valid name for application is "+ ValidUsername);
		System.out.println("the valid password for testing is  "+ ValidPassword);
		
		//write
		FileOutputStream fos = new FileOutputStream("./src/test/resources/orangehrm_commonData/Write.properties");
		prop.setProperty("CandidateName", "Thomas");
		prop.store(fos, null);
	}
}
