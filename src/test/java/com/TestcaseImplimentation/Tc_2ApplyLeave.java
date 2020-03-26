package com.TestcaseImplimentation;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.FWUtility.GetScreenShots;
import com.PageObjects.Hrm_All_Page_Objects;
import com.WebCommonMethods.BaseClassOfNew;
import com.WebCommonMethods.CommonWebFunctions;


public class Tc_2ApplyLeave extends CommonWebFunctions  {
public static GetScreenShots gsc=new GetScreenShots();	
	
	
	
public static void applyleave()
{
	Hrm_All_Page_Objects pageobjects=PageFactory.initElements(driver, Hrm_All_Page_Objects.class);
	mousehover(pageobjects.LeaveTab);
	pageobjects.applyLink.click();
	dropLeaveType(pageobjects.LeaveType);
	pageobjects.FromDate.clear();
	pageobjects.FromDate.sendKeys(TodatePicker());
	pageobjects.todatlabel.click();
	pageobjects.ToDate.clear();
    pageobjects.ToDate.sendKeys(FromdatePicker());
Commentbox(Hrm_All_Page_Objects.commentxpath,"test");
	gsc.getscreenshots();
	}
}