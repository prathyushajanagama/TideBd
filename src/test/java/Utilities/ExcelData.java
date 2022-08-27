package Utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
		
		    XSSFWorkbook WB;
			public ExcelData() {
				
				File src=new File("C:\\Users\\Prathyusha Janagama\\Downloads\\TideBDD\\TideBDD\\TestData\\Data.xlsx");
				
				try {
					
				FileInputStream fis=new FileInputStream(src);
					WB=new XSSFWorkbook(fis);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Unable to read excel file"+e.getMessage());
				}
				
			}
			
			public String getStringData(String sheetName,int row,int column) {
				return WB.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
			}
			
			public String getStringData(int sheetIndex,int row,int column) {
				return WB.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
			}
			
			public double getNumberData(String sheetName,int row,int column) {
				return WB.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
			}

		
		
		

	}


