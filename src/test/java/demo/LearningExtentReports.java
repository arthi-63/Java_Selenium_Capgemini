package demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReports {
	@Test
	public void practice() {
		// create new test
		ExtentReports test = new ExtentReports();
		//create a reporter
		ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/sample_report.html");
		test.attachReporter(spark);
		
		ExtentTest ref = test.createTest("Sample Test");
		//logging
		ref.info("---Started test Execution---");
		ref.pass("---The test step has passed---");
		ref.fail("---The test step has failed---");
		
		//write the report
		test.flush();
	}

}
