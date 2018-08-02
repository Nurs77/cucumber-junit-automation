package tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {
	
	public static void main(String[] args) throws IOException {
		FileInputStream excelFile = new FileInputStream("/Users/cybertekchicago-1/Desktop/data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
	
		// Read value from Excel sheet
		XSSFSheet sheet = workbook.getSheet("dataHere");
		System.out.println(sheet.getPhysicalNumberOfRows());
		
		XSSFRow row = sheet.createRow(10);
		System.out.println(row == null);
		XSSFCell cell = row.createCell(0);
		System.out.println("Current value: " + cell.toString());
		cell.setCellValue("Donald");
		System.out.println("later value: " + cell.toString());
		FileOutputStream out = new FileOutputStream("/Users/cybertekchicago-1/Desktop/data.xlsx");
		workbook.write(out);
		out.close();
		
		out = new FileOutputStream("/Users/cybertekchicago-1/Desktop/d.xlsx");
		workbook.write(out);
		out.close();
	}

}











