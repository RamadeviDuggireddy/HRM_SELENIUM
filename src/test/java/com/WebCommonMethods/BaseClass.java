package com.WebCommonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	public static WebDriver driver;
/*author:Rama
 * Method:
 * Method Description:It is used to launch the browser
 * date:18-03-2020.
 */
public static void getBrowser(String browser)
{
switch(browser)	
{
      case "Chrome" :
            System.setProperty("webdriver.chrome.driver","C:\\Users\\SreenivasuluSurasani\\Downloads\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.get("http://www.testingmasters.com/hrm/");
            System.out.println("chrome browser is launched");
            break;
      case "Firefox": 
	         System.setProperty("webdriver.gecko.driver","C:\\Users\\SreenivasuluSurasani\\Downloads\\geckodriver.exe");
	         driver=new FirefoxDriver();
	         driver.get("http://www.testingmasters.com/hrm/");
	         System.out.println("firefox browser is launched");
	         break;
	  case "IE" :
		    System.setProperty("webdriver.ie.driver","C:\\Users\\SreenivasuluSurasani\\Downloads\\IEDriverServer.exe");
		    driver=new InternetExplorerDriver();
		    driver.get("http://www.testingmasters.com/hrm/");
		    System.out.println("ie browser is launched");
		
}
}
}