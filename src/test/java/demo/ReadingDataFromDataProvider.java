package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromDataProvider {
	@DataProvider(name="sampleData")
	public Object[][] getdata(){
		return new Object[][] {
			{"Browser","chrome","1"},
			{"Username","Admin","2"},
			{"password","admin123","3"},
		};
	}
	
	@DataProvider(name="sampleData1")
	Object[][]getinfo(){
		return new Object[][] {
			{"Browser","firefox","1"},
			{"username","user","2"},
			{"password","user123","3"}		
		};
	}
	
	@Test(dataProvider="sampleData1")
	public void readingromDataProvider(String key, String value, String data) {
		System.out.println("My key is: "+key+"========>>>> My value is: "+value+"=======>>>> My data is: "+data );
	}

}
