package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDprovider {

	
	public static String GetStringData(String Sheetname,int row,int cell) throws Exception {
		
		String path="D:\\Framework practice & project\\Workspace\\selenium2025\\TestData\\TestData.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook xf=new XSSFWorkbook(fis);
		
		String Stringdata=xf.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return Stringdata;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

}
