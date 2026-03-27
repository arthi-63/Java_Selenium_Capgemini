package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert {
	@Test
	public void demoTest() {
		String actualValue="PECC";
		String expectedValue="PEC";
		
		//soft assertion
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualValue, expectedValue);
		
		if(actualValue.equals(expectedValue)) {
			System.out.println("Status: Pass");
		}
		else {
			System.out.println("Status: Fail");
		}
	}

}
