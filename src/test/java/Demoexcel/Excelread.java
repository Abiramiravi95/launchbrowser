package Demoexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Abirami\\eclipse-workspace\\Demoexcel\\Excel\\demo.xlsx");
		FileInputStream stream = new FileInputStream(file); 
		Workbook workbook = new XSSFWorkbook(stream);
	Sheet sheet=workbook.getSheet("sheet1");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		
		Row row = sheet.getRow(i);	
		
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		
		Cell cell = row.getCell(j);
		int type = cell.getCellType();
		
		String s = cell.getStringCellValue();
		System.out.println(s);
		}
		
	}
	
	
	
	}

}
