package com.TestcaseImplimentation;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.support.PageFactory;

import com.FWUtility.GetScreenShots;
import com.PageObjects.Hrm_All_Page_Objects;
import com.WebCommonMethods.BaseClassOfNew;
import com.WebCommonMethods.CommonWebFunctions;


public class Tc_3MyLeaveList  extends GetScreenShots {
	public static CommonWebFunctions cf=new CommonWebFunctions();	
	
	

public static void	myleaveList()
{
	Hrm_All_Page_Objects pageobjects=PageFactory.initElements(driver, Hrm_All_Page_Objects.class);
	pageobjects.MyLeave.click();
	pageobjects.From.clear();
	pageobjects.From.sendKeys(cf.FromdatePicker());
	pageobjects.To.clear();
	pageobjects.To.sendKeys(cf.TodatePicker());
	boolean status=pageobjects.Status.isSelected();
	if(status==true)
	{
	System.out.println("status is selected");	
	}
	else
	{
		System.out.println("status is not selected");
	}
	
pageobjects.Search.click();
getscreenshots();
}
}
