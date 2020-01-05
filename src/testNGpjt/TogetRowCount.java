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


public class TogetRowCount {

	public static void main(String[] args) throws Exception, Exception {
 //To create file
		File fis=new File("./data/input.xlsx");
//to read the file
 FileInputStream fis1= new FileInputStream(fis);
 //Create the workbook
 Workbook wb = WorkbookFactory.create(fis);
 //to get the sheet
 Sheet sh= wb.getSheet("Sheet1");
 //to get the row count
 int rc = sh.getLastRowNum();
 System.out.println(rc);
 
	}
	
	
}	
