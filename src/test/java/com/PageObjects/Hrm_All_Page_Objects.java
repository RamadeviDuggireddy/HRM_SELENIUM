package com.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hrm_All_Page_Objects {
/*PageName:Login page.
 * Where we reuse:It is used under com.Testcaseimplimentation.
 * Author:Rama.
 * 	Date:19-03-2020
 */
  @FindBy(xpath="//input[@id='txtUsername']")public static WebElement username;	
  @FindBy(xpath="//input[@id='txtPassword']")public static WebElement password;
  @FindBy(xpath="//input[@id='btnLogin']")public static WebElement Loginbutton;
 
  /*PageName:ApplyLeavePage.
   * Where we reuse:It is used under com.Testcaseimplimentation.
   * Author:Rama.
   * 	Date:19-03-2020
   */
  @FindBy(xpath="//a[@id='menu_leave_viewLeaveModule']")public static WebElement LeaveTab;
  @FindBy(xpath="//a[@id='menu_leave_applyLeave']")public static WebElement applyLink;
  @FindBy(xpath="//select[@name='applyleave[txtLeaveType]']")public static WebElement LeaveType; 
  @FindBy(xpath="//input[@id='applyleave_txtFromDate']")public static WebElement FromDate;
 // @FindBy(xpath="//a[text()='20']")public static WebElement FromDate;
  @FindBy(xpath="//label[text()='To Date ']")public static  WebElement todatlabel;
  @FindBy(xpath="//input[@type='text']")public static WebElement ToDate;
  public static String   commentxpath="//textarea[@name='applyleave[txtComment]']";
  @FindBy(xpath="//input[@id='applyBtn']")public static WebElement Applybutton;
  
  

  /*PageName:My LeaveList page.
   * Where we reuse:It is used under com.Testcaseimplimentation.
   * Author:Rama.
   * 	Date:20-03-2020
   */	
  
  @FindBy(xpath="//a[@id='menu_leave_viewLeaveModule']")public static WebElement MyLeave;
  @FindBy(xpath="//input[@id='calFromDate']")public static WebElement From;
  @FindBy(xpath="//input[@id='calToDate']")public static WebElement To;
  @FindBy(xpath="//div[@id='leaveList_chkSearchFilter_checkboxgroup']")public static WebElement Status ;
  @FindBy(xpath="//input[@name='btnSearch']")public static WebElement Search;
}
   
	  