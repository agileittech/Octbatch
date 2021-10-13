package excelhandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
FileOutputStream fo = new FileOutputStream("C:\\Filehandling\\Myworkbook.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook();
Sheet sheet = workbook.createSheet("POI SHEET");
Row row = sheet.createRow(0);
Cell cell = row.createCell(0);
cell.setCellValue("Hi this is from POI");
workbook.write(fo);
workbook.close();
	}

}
