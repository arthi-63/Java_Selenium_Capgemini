package com.orangehrm.GenericUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
	
	public static ExtentReports extent;
	
	public static ExtentReports getExtentInstance() {
		if(extent==null) {
			
		ExtentSparkReporter spark = new ExtentSparkReporter("");
		//reporter Configuration
		spark.config().setReportName("OrangeHRM UI Automation Report");
		spark.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Automation Tester", "Rangiiii");
		extent.setSystemInfo("UI_Automation_Framework", "SeleniumTestNG");
		}
		return extent;
	}
}
