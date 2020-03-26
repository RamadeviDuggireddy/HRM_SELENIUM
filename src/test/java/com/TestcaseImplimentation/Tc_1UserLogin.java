package com.TestcaseImplimentation;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.FWUtility.GetScreenShots;
import com.FWUtility.ReadDataFromExcel;
import com.PageObjects.Hrm_All_Page_Objects;
import com.WebCommonMethods.BaseClassOfNew;



public class Tc_1UserLogin extends GetScreenShots {
	public static ReadDataFromExcel rdfe=new ReadDataFromExcel();
	
/*Method Name:Hrm_Login.
 * where we reuse:It is used under com.TestRunner.
 * Method Description:to enter valid details.
 * Author:Rama.
 * Date:19-03-2020.
 */
   
	public static void Hrm_Login() throws IOException
   {

		
Hrm_All_Page_Objects pageobjects=PageFactory.initElements(driver, Hrm_All_Page_Objects.class);
String username=rdfe.getdatafromexcel("UserDetails",1,1);
String password=rdfe.getdatafromexcel("UserDetails",1,2);
pageobjects.username.sendKeys(username);
pageobjects.password.sendKeys(password);
pageobjects.Loginbutton.click();
getscreenshots();
	}	
}
