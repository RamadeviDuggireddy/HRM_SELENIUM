package com.TestcaseImplimentation;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.FWUtility.GetScreenshotsOfHtmlReports;
import com.PageObjects.Hrm_All_Page_Objects;
import com.WebCommonMethods.BaseClassOfHtmlReports;



public class User_loginHTmlreports  extends  BaseClassOfHtmlReports {
	public static void Hrm_Login() throws IOException
	   {
	Hrm_All_Page_Objects pageobjects=PageFactory.initElements(driver, Hrm_All_Page_Objects.class);
	pageobjects.username.sendKeys("user03");
	pageobjects.password.sendKeys("pass1234");
	pageobjects.Loginbutton.click();
	   }	
}
