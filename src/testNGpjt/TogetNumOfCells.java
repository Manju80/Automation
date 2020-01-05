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


public class TogetNumOfCells {

	public static void main(String[] args) throws Exception, Exception {
 //To create file
		File fis=new File("./data/input.xlsx");
//to read the file
 FileInputStream fis1= new FileInputStream(fis);
 //Create the workbook
 Workbook wb = WorkbookFactory.create(fis);
 //to get the sheet
 Sheet sh= wb.getSheet("Sheet1");
 //to get number of cells present in the row
 Row rc=sh.getRow(1);
 short cc = rc.getLastCellNum();
 System.out.println(cc);
 //getLastRowNum() return indexvalue of last row.Index value starts from 0.
 //getLastCellNum() returns number of cells present in the row
 
	}
	
	
}	
