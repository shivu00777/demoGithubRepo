package dataDrivenFromExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDT {

	public static void main(String[] args) throws IOException {
		
		
		// Excel file > WorkBook > sheet > Row > cells
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testData\\INV - Aquabloom 1.xlsx");

		XSSFWorkbook WorkBook = new XSSFWorkbook(file);
		
		XSSFSheet Sheet = WorkBook.getSheet("Sheet1");
		
		
		int totalRows  = Sheet.getLastRowNum();
		
		int totalcells = Sheet.getRow(0).getLastCellNum();
		
		System.out.println("number of Rows:"+totalRows);
		
		System.out.println("number of Cells:"+totalcells);
		
		
		for(int r=0; r<=totalRows; r++) {
			
			XSSFRow currentRow = Sheet.getRow(r);
			
			for(int c=0; c<totalcells; c++) {
				
				XSSFCell currentCell = currentRow.getCell(c);
				System.out.print(currentCell.toString()+"\t");
				
			}
		
		
			System.out.println();
		}
		
		WorkBook.close();
		file.close();
		
	}

}

