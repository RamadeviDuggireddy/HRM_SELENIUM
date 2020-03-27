package com.FWUtility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.TestcaseImplimentation.User_loginHTmlreports;
import com.WebCommonMethods.BaseClassOfHtmlReports;

public class GetScreenshotsOfHtmlReports extends User_loginHTmlreports 
{
    public static String fpath;
	public static TakesScreenshot ts;
	public static File source;
		/*Method name:getscreenshots.
	      * Method description:It is used to cature the screenshots.
	      * Author:Rama
	      * Date:23-03-2020.
	      */
	public static String getscreenshots()
	{
	 


	try {
		fpath=System.getProperty("user.dir")+"//Screenshots//Hrm_"+getSystemDate()+".png";

		 //fpath ="C:\\Users\\SreenivasuluSurasani\\eclipse-workspace1\\MAVEN_1\\Screenshots\\Hrm_shots_"+name+".png";
	    ts = (TakesScreenshot)driver;
		source = ts.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(source,new File(fpath));
		System.out.println("screen shot is captured");
	   } catch (IOException e) {
		
		System.out.println("screenshot is not captured");
	   }
	return fpath;
	}

public static String getSystemDate()
{
Date dt=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss"); 
String currentdate=sdf.format(dt);
//System.out.println("systemdate:"+currentdate);

return currentdate;	
}
}


