package day1;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");	
		//find the row of the table
		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(row);
	
		//find the col of the table
		 int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		 
		 System.out.println(col);
		
		 //read data from specific row and coloum
	String	bokk =driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		 System.out.println(bokk);
		 
		 //read data from all the row and col
		 
		 for(int r=2; r<=row;r++) {
			 for(int c=1;c<=col; c++) {
				 String	value =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				 System.out.println(value+"\t");
			 }
		 }
		 
		 //print book names whoes authoe is mukesh
		 for(int r=2;r<=row;r++) {
			 String	authorName =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		  if(authorName.equals("Mukesh")) {
			  String	book =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
		  System.out.println(book +"\t"+authorName);
		  
		  }
		 
		 }
		 
		//find total price
		 
		 int total=0;
		 for(int r=2;r<=row;r++) {
			 String	price =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		 
		 total=total+Integer.parseInt(price);
		 
		 }
		 System.out.println(total);
		 
		 
		 
		 driver.quit();
	}

}
