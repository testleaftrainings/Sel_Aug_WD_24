package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntegrationWithTC {

	//step4 change main method into normal method 
	//retain the static keyword
	public static String[][] readExcel(String fileName) throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet sheetAt = wb.getSheetAt(0);
		
		int rowValue = sheetAt.getLastRowNum();
		int cellValue = sheetAt.getRow(1).getLastCellNum();
		//step 1 -- [5][4]
		String[][] data=new String[rowValue][cellValue];
		for (int i = 1; i <=rowValue; i++) {
			
			for (int j = 0; j < cellValue; j++) {
				String value = sheetAt.getRow(i).getCell(j).getStringCellValue();

//step 2 read value from excel and pass it to dataprovider
				data[i-1][j]=value;
				
			}
		}
		
		wb.close();
		//step3  return variable name
		return data;
		
		
		
		
		
		

	}

}
