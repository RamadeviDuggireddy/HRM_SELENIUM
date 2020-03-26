package com.WebCommonMethods;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonWebFunctions extends BaseClassOfNew {
	/*Method Name:mousehover
	 * Where we reuse:It is used under com.Testcaseimplimentation.
	 * Author:Rama.
	 * 	Date:19-03-2020
     */
public static void mousehover(WebElement element)
{
	Actions act=new Actions(driver);
	act.moveToElement(element).build().perform();
	
}
/*Method Name:dropLeaveType.
 * Where we reuse:It is used under com.Testcaseimplimentation.
 * Author:Rama.
 * 	Date:19-03-2020
 */
public static void dropLeaveType(WebElement element)
{
Select sel=new Select(element);
sel.selectByIndex(2);

}
/*Method Name:datePicker.
 * Where we reuse:It is used under com.Testcaseimplimentation.
 * Author:Rama.
 * 	Date:23-03-2020
 */

public static String FromdatePicker() {
Date dt=new Date();
dt.setDate(dt.getDate()+3);
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
String currentdate=sdf.format(dt);
System.out.println("systemdate1:"+currentdate);
return currentdate;

}
public static String TodatePicker()
{
	Date dt=new Date();
	dt.setDate(dt.getDate()+4);
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	String currentdate1=sdf.format(dt);
	System.out.println("systemdate2:"+currentdate1);
	
	return currentdate1;
	}
/*Method Name:Commentbox.
 * Where we reuse:It is used under com.Testcaseimplimentation.
 * Author:Rama.
 * 	Date:19-03-2020
 */
 
  public static void Commentbox(String xpath,String comment)
   {
 WebElement element =driver.findElement(By.xpath(xpath));
	  
	element.sendKeys(comment);
	  
   }

}
