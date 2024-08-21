package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamiPagigination {

	public static void main(String[] args) throws InterruptedException {
		
	 WebDriver driver =new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.manage().window().maximize();
	 driver.get("https://demo.opencart.com/admin/");
	 
	WebElement useName=driver.findElement(By.id("input-username"));
	useName.clear();
	useName.sendKeys("demo");
	
WebElement  userPassword=driver.findElement(By.id("input-password"));
		userPassword.clear();
		userPassword.sendKeys("demo");
		
		
		
	
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		

	}

}
