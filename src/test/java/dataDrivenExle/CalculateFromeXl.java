package dataDrivenExle;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculateFromeXl {

	public static void main(String[] args) throws IOException, Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");	
       
		String filePath = System.getProperty("user.dir")+"\\testData\\Deposit.xlsx";
		 
		//read data frome excel
		int rows=ExcelUtility.getRowCount(filePath, "sheet1");
		
		for(int i=1;i<= rows;i++) {
			
			String initailDepo=ExcelUtility.getCellData(filePath, "sheet1", i, 0);
			String length=ExcelUtility.getCellData(filePath, "sheet1", i, 1);
			String intrestRate=ExcelUtility.getCellData(filePath, "sheet1", i, 2);
			String compounding=ExcelUtility.getCellData(filePath, "sheet1", i, 3);
			String total=ExcelUtility.getCellData(filePath, "sheet1", i, 4);
		
	
		
//		pass data into apllication
		
	WebElement initialInput=driver.findElement(By.id("mat-input-0"));
		initialInput.clear();
		initialInput.sendKeys(initailDepo);
	WebElement	lengthF=driver.findElement(By.id("mat-input-1"));
	lengthF.clear();
		lengthF.sendKeys(length);
		
	WebElement	intres=driver.findElement(By.id("mat-input-2"));
	intres.clear();
	intres.sendKeys(intrestRate);
	
	WebElement dropD=driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c109-4']"));
	dropD.click();
	String xpath= "//span[text()='" + compounding + "']";
	driver.findElement(By.xpath(xpath)).click();
	
	driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")).click();
	
	
	
	
	
		}
	driver.quit();
	}

}
