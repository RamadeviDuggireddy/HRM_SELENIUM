package com.FWUtility;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class GenerateHtml extends GetScreenshotsOfHtmlReports {
public static  ExtentHtmlReporter extenthtml;	
public static ExtentReports extentreports;
public static ExtentTest logger;
/*
 * 
 * 	GenerateHtmlReports
 */
 @BeforeSuite
public static void getHtmlReports()
{
System.out.println("user start to create html reports");	 
 extenthtml=new ExtentHtmlReporter(System.getProperty("user.dir")+"//Reports//Hrm_"+getSystemDate()+".html");	
 extentreports=new ExtentReports();
 extentreports.attachReporter(extenthtml);

System.out.println("user able to create html reports");
}
@AfterMethod
public static void captureTheHtmlScreenShotsReports(ITestResult result) throws IOException
{
Reporter.log("user is able to cature the screenshot reports");	
if(result.getStatus()==ITestResult.SUCCESS)
{	
 logger.pass("Success",MediaEntityBuilder.createScreenCaptureFromPath(getscreenshots()).build());
System.out.println("user is able to cature success screenshot reports");
}
else if(result.getStatus()==ITestResult.FAILURE)
{
	logger.fail("Failure",MediaEntityBuilder.createScreenCaptureFromPath(getscreenshots()).build());
	System.out.println("user is unbale failure to cature screenshot reports");
}
else
{
System.out.println("user is unable to cature the screenshot reports");	
}
extentreports.flush();
Reporter.log("html screenshots are generated",true);
}

}