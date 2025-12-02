package dataDrivenFromExcel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingDataExcel {

	public static void main(String[] args) throws IOException {
	
		
		// Created New File
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myNewFile.xlsx");
		
		XSSFWorkbook WorkBook = new XSSFWorkbook();      // Creating WorkBokk 
		
		XSSFSheet sheet = WorkBook.createSheet("Data");  // Creating sheet with Name
		
		
		
		
		XSSFRow Row1 = sheet.createRow(0);               // Creating Row1
			Row1.createCell(0).setCellValue("Java");	 //	Create data in cell no (0)  of Row no (0)
			Row1.createCell(1).setCellValue(19);
			Row1.createCell(2).setCellValue("Automation");
		
		
		
		XSSFRow Row2 = sheet.createRow(1);
			Row2.createCell(0).setCellValue("C#");
			Row2.createCell(1).setCellValue(3);
			Row2.createCell(2).setCellValue("Automation");
			
		
		
		
		
		XSSFRow Row3 = sheet.createRow(2);
			Row3.createCell(0).setCellValue("python");
			Row3.createCell(1).setCellValue(2);
			Row3.createCell(2).setCellValue("Automation");
		
		
			WorkBook.write(file);  // Merge the workbook with file
			WorkBook.close();	   // Close the workbook
			file.close();          // Close the File
			
			
			System.out.println("File Created");

	}

}
