package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");	
		 WebElement dropDownEl=driver.findElement(By.id("country"));
		 Select dropDownCrt = new Select(dropDownEl);
		 dropDownCrt.selectByVisibleText("Canada");
		 
		 //capture the option from the dropdown
		    List<WebElement>  options= dropDownCrt.getOptions();
		    
		    for(WebElement op: options) {
		    	
		    	System.out.println(op.getText());
		    }
		 
	}

}
