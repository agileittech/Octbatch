package excelhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

public String ReadExcel(String filename,String sheetname,int rownumber,int colnumber) throws IOException {	
		// TODO Auto-generated method stub
FileInputStream fi = new FileInputStream(filename);
XSSFWorkbook workbook = new XSSFWorkbook(fi);
Sheet sheet = workbook.getSheet(sheetname);
Row row = sheet.getRow(rownumber);
Cell cell = row.getCell(colnumber);
String str = cell.getStringCellValue();
workbook.close();
return str;
	}

}
