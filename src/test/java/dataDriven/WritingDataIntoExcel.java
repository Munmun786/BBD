package dataDriven;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myTest.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		     XSSFSheet sheet=workbook.createSheet("data");
	
		     XSSFRow row1=sheet.createRow(0);
	    row1.createCell(0).setCellValue("java");
	    row1.createCell(1).setCellValue("1234");
	    row1.createCell(2).setCellValue("automn");
	

	     XSSFRow row2=sheet.createRow(1);
   row2.createCell(0).setCellValue("jva");
   row2.createCell(1).setCellValue("1234");
   row2.createCell(2).setCellValue("auomn");

	workbook.write(file);
	workbook.close();
	file.close();
	
	System.out.println("file created");
	}

}
