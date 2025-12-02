package dataDrivenFromExcel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingDatainSpecificRowAndCell {

	public static void main(String[] args) throws IOException {
		
		
		// Created New File
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\specificDateinRowAndCells.xlsx");
		
		XSSFWorkbook WorkBook = new XSSFWorkbook();      // Creating WorkBokk 
		
		XSSFSheet sheet = WorkBook.createSheet("specificData");  // Creating sheet with Name
		
		
		XSSFRow Row3 = sheet.createRow(2);   // Create Row no 2
		
		XSSFCell Cell4 = Row3.createCell(3);   // Create Cell no 3
		Cell4.setCellValue("Demo Data");       // Entering Data inside the Cell no 4
		
		
		
				
		WorkBook.write(file);  // Merge the workbook with file
		WorkBook.close();	   // Close the workbook
		file.close();          // Close the File
		
		
		System.out.println("File Created");

		
		
	}

}
