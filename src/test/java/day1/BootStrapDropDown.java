package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");	
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	
	//select one option\
		driver.findElement(By.xpath("//input[@value='csharp']")).click();
		
		//capture all the option and find out size
	   List<WebElement>	options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	  System.out.println(options.size());
	   
	    for(WebElement op: options) {
	    	
	    	System.out.println(op.getText());
	    }
	    
	    //select all the option
	    for(WebElement op: options) {
	    	    String opt=op.getText();
	    	if(opt.equals("java") || opt.equals("c++")) {
	    		op.click();
	    		
	    	}
	    	
	    }
	    
	}

}
