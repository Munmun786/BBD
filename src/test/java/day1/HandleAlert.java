package day1;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);
	  Alert	alert=driver.switchTo().alert();
	         System.out.println(alert.getText()); 
	  alert.accept();
		Thread.sleep(5000);
		//dismis alert
	  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	  driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		//prompt
	driver.findElement(By.xpath("")).click();
	  Alert myAlert= driver.switchTo().alert();
	  myAlert.sendKeys("wec");
	  myAlert.accept();
	}
	
	//dismis alert
	


}
