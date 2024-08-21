package day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		//select the checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		  List<WebElement> checkBoxs=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		  for(WebElement checkbox : checkBoxs) {
			  
			  checkbox.click();
			  
		  }
		  
		  Thread.sleep(10000);
		  //unselect checkbox if they are selected
		  
		  for(int i=0;i <5;i++) {
			  
			  if(checkBoxs.get(i).isSelected()) {
				  checkBoxs.get(i).click();
			  }
			  
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		Thread.sleep(5000);
		driver.quit();
		
	}

}
