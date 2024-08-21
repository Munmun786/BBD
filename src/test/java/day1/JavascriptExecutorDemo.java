package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver =new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
   driver.manage().window().maximize();
   
   driver.get("https://testautomationpractice.blogspot.com/");
  WebElement inputField=driver.findElement(By.id("name"));
  JavascriptExecutor js= (JavascriptExecutor)driver;
  js.executeScript("arguments[0].setAttribute('value','munmun')",inputField);
		
	}

}
