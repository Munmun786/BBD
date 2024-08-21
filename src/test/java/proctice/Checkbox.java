package proctice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
//		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//multiple check box
		List<WebElement> checkboxs= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		
		for(WebElement checkbox : checkboxs) {
			
			checkbox.click();
			
		}
		
		for(int i = 0; i <checkboxs.size();i++) {
			
			if(checkboxs.get(i).isSelected()) {
				
				checkboxs.get(i).click();				
			}
		}
		
		
	}

}
