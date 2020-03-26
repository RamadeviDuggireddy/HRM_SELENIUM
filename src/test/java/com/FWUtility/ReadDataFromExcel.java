package com.FWUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
public static File location;
public static FileInputStream fis;
public static XSSFWorkbook xssf;
public static XSSFSheet xssfs;
public static String value;
	
public static String getdatafromexcel(String sheetname,int row,int column) throws IOException { 

	 
	
	try {
		location=new File("C:\\Users\\SreenivasuluSurasani\\eclipse-workspace1\\MAVEN_1\\INPUTDATA.xlsx");
		
		fis = new FileInputStream(location);
		 xssf = new XSSFWorkbook(fis);
		 xssfs=xssf.getSheet(sheetname);
		 value=xssfs.getRow(row).getCell(column).getStringCellValue();
	}
		 catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("User is unable to read the data from excel");
	}
	return value;
	
}
}
