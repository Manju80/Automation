package testNGpjt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.WorkbookUtil;


public class ExcelData {

public static void main(String[] args) throws Exception, Exception {
 //To create file
		File fis=new File("./data/input.xlsx");
//to read the file
 FileInputStream fis1= new FileInputStream(fis);
 //Create the workbook
 Workbook wb = WorkbookFactory.create(fis);
 //to get the sheet
 Sheet sh= wb.getSheet("Sheet1");
 //to get the row
 Row rc=sh.getRow(2);
 //to get the cell value
 Cell cc= rc.getCell(0);
 //to get the data
 String data= cc.getStringCellValue();
 System.out.println(data);
 
	}
	
	
}	
