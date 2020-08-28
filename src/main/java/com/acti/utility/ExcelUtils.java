package com.acti.utility;  //VIDEO 41

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	XSSFWorkbook excel;
	public ExcelUtils(String xlPath) {
		
		
		
		// this excel sheet will change, so pass as parameter and do not hard code
		//File file = new File("./TestData/TestData1.xlsx"); // do not hard code like this
		//Select the below 3 lines and right click, click surround with try/catch
		/*File file = new File("./TestData/TestData1.xlsx"); 
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook excel = new XSSFWorkbook(fis);*/
		
		
		try 
		{
			File file = new File(xlPath); 
			FileInputStream fis = new FileInputStream(file);	
			excel=new XSSFWorkbook(fis);
		} 
		
		catch (Exception e) 
		{
			
			System.out.println("No Excel Sheet found at this path "+e.getMessage());
		} 
	}
		
	
		public int getRowCount(int sheetNum)  // get last row count
		{
			
			int count = excel.getSheetAt(0).getLastRowNum()+1;
			
			return count;
		}
	
		
		
		public String getCellData(int sheetNum, int row, int col) // getting cell values
		{
			String data = excel.getSheetAt(sheetNum).getRow(row).getCell(col).toString();
			
			return data;
		}


}
