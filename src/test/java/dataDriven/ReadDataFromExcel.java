package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//Excel file--->WorkBook---->Sheet----->Rows----->cells		
		
		
		 FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\testData\\testDatas.xlsx");
	        XSSFWorkbook workbook= new XSSFWorkbook(file);
	       XSSFSheet sheet= workbook.getSheet("Login");
	        int totalRows=sheet.getLastRowNum();
	       int totalCells=sheet.getRow(1).getLastCellNum();
	        System.out.println("number of Rows"+ totalRows);
	        System.out.println("number of Cell"+totalCells);
	
	 for(int r=0; r<=totalRows; r++) {
		XSSFRow  currentRow=sheet.getRow(r);
		 for(int c=0; c< totalCells;c++) {
			XSSFCell cell=currentRow.getCell(c);
			System.out.println(cell.toString()+"\t");
		 }
		 System.out.println();
	 }
	
	
	workbook.close();
	file.close();
	
	
	}

}
