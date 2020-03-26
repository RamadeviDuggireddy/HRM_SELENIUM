package com.WebCommonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass1 {
	public static void getbrowser(String browser )	
	{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SreenivasuluSurasani\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("http://www.testingmasters.com/hrm/");
			System.out.println("chrome browser is launched");
		}
}
