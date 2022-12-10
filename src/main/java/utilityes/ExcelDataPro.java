package utilityes;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataPro {
	
	
//	public static String pathFile;
//	public static String sheetName;
//	public ExcelDataPro(String pathFile,String sheetName) {
//		this.pathFile = pathFile;
//		this.sheetName = sheetName;
//	}
	
	@DataProvider
	public static String[][] getData() throws Exception {
		File file = new File("./src/test/resources/excel/swaglab.xlsx");
		FileInputStream fileInt = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fileInt);
		XSSFSheet sheet = wb.getSheet("swaglab");
		int NoOfRow = sheet.getLastRowNum()+1;
		int NoOfColm = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[NoOfRow][NoOfColm];
				{
			for(int i=1;i<NoOfRow;i++) {
				for(int j=0;j<NoOfColm;j++) {
					DataFormatter df = new DataFormatter();
					data[i][j]= df.formatCellValue(sheet.getRow(i).getCell(j));
				}
			}
			fileInt.close();
				}
				return data;
	}
	public static void main(String[] args) {
		try {
			ExcelDataPro.getData();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

