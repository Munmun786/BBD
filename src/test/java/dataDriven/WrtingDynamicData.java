package dataDriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrtingDynamicData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testData\\dynamicData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("dynamicdata");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number of rows");
		int onOfrows = sc.nextInt();
		
		System.out.println("enter number of cell");
		int onOfcells=sc.nextInt();
		
		for(int r=0; r<= onOfrows; r++) {
			   XSSFRow currentRow=sheet.createRow(r);
		
		for(int c=0;c<onOfcells;c++) {
			
			   XSSFCell cell=currentRow.createCell(c);
			    cell.setCellValue(sc.next());
		}
		
		
		}
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("create file");
		
	}

}
