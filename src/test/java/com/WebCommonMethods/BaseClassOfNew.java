package com.WebCommonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassOfNew {
public static WebDriver driver;
	/*Author:rama.
	 * Method Name:getbrowser.
	 * Method Description:It used to get the browser.
	 * Where we reuse:It is used under com.TesrRunner.
	 *  Date:19-03-2020.
	 */
public static void getbrowser(String browser)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SreenivasuluSurasani\\Downloads\\chromedriver.exe");
 driver=new ChromeDriver();
    driver.get("http://www.testingmasters.com/hrm/");
    
}	
}
