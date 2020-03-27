package com.TestRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import com.FWUtility.GenerateHtml;
import com.TestcaseImplimentation.User_loginHTmlreports;


public class ExcutionWndowOfHtmlReports extends GenerateHtml {
public static User_loginHTmlreports ulhtml=new User_loginHTmlreports();
	@Test
	public static void Testexecution() throws IOException
	{
		try
		{ 
			logger=extentreports.createTest("launch the browser");
		
		getbrowser("Chrome");
		logger.pass("user is able launch the browser");
		}catch(Exception e)
		{
			logger.fail("user is able launch the browser");	
		}
		try {
			logger=extentreports.createTest("login hrm");
			ulhtml.Hrm_Login();
			
			logger.pass("user is able to login hrm");
			}catch(Exception e)
			{
				logger.fail("user is able to login hrmr");	
		}
	}	
}
