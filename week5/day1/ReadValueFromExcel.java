package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValueFromExcel {

	public static void main(String[] args) throws IOException {

		//Step1-> Set path for workbook
		//step2-> Get into the sheet
		//Step3-> Get into Row values
		//Step4-> Get into cell values
		//Step5-> Read Data from workbook and print
		//Step6-> close the workbook
		
		
		//step1 
		XSSFWorkbook wb=new XSSFWorkbook("./data/LoginPage.xlsx");
		
		//step2
		//index value will start from '0'
		//XSSFSheet sheetAt = wb.getSheetAt(0);
		//sheet name
		XSSFSheet sheetAt = wb.getSheet("LoginPage");
		
		//step 3
		//excluding header value
		int rowValue = sheetAt.getLastRowNum();
		System.out.println("Row count :"+rowValue);
		
		//include header value
		int ph = sheetAt.getPhysicalNumberOfRows();
		System.out.println("Include header value of row  : "+ph);
		
		//step4
		int cellValue = sheetAt.getRow(1).getLastCellNum();
		System.out.println("cell value :"+cellValue);
		
		//read the value from excel sheet
		String name = sheetAt.getRow(1).getCell(0).getStringCellValue();
		System.out.println(name);
		
		// step 5 print all values from excel sheet
		
		for (int i = 1; i <=rowValue; i++) {
			
			for (int j = 0; j < cellValue; j++) {
				String value = sheetAt.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				
			}
		}
		
		//step 6
		wb.close();
		
		
		
		
		
		
		

	}

}
