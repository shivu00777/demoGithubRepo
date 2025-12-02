package dataDrivenFromExcel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingDynamicData {

	public static void main(String[] args) throws IOException {

		
		// Created New File
				FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myNewFile2.xlsx");
				
				XSSFWorkbook WorkBook = new XSSFWorkbook();      // Creating WorkBokk 
				
				XSSFSheet sheet = WorkBook.createSheet("DynamicData");  // Creating sheet with Name
				
				
				Scanner sc = new Scanner(System.in);  // Taking Data from user
				
				
				System.out.println("Enter how many Rows are?");
				int noofRows = sc.nextInt();
				
				
				System.out.println("Enter how many Cells are?");
				int noofCells = sc.nextInt();

				
				
				
				for(int r=0; r<=noofRows; r++) {
					
					XSSFRow currentRow = sheet.createRow(r);
					
					
					for(int c=0; c<noofCells; c++) {
						
						XSSFCell currentCells = currentRow.createCell(c);
						currentCells.setCellValue(sc.next());
					}
				}
				
				WorkBook.write(file);  // Attach the workbook with file
				WorkBook.close();	   // Close the workbook
				file.close();          // Close the File
				
				
				System.out.println("File Created");
		
	}

}
