package practice;

import org.testng.annotations.Test;

public class TestPractice {
	@Test
	public void LoginTest(){
		System.out.println("-----Executing login sequence------");
	}
	
	@Test(dependsOnMethods = "LoginTest")
	public void LogoutTest() {
		System.out.println("-------Executing logout sequence--------");
	}
}
