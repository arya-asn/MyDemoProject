package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static FileInputStream file;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	// to get String Data
	public static String  getStringData(int a , int b) throws IOException { 
		file=new FileInputStream("C:\\Users\\HP\\Documents\\excel.xlsx");
		book = new XSSFWorkbook(file);
		sheet= book.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(a);
		XSSFCell cell = row.getCell(b);
		return cell.getStringCellValue();
		
	}
	public static String getIntData(int a,int b) throws IOException {
		file=new FileInputStream("C:\\Users\\HP\\Documents\\excel.xlsx");
		book = new XSSFWorkbook(file);
		sheet= book.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(a);
		XSSFCell cell = row.getCell(b);
		int data = (int) cell.getNumericCellValue();
		return String.valueOf(data);
		
		
		
	}
	

}
