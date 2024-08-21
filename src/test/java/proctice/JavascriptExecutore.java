package proctice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutore {

	public static void main(String[] args) throws Throwable {

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Locate the input box
		WebElement radioBtto=driver.findElement(By.xpath("//input[@id='male']"));
		
		// Execute JavaScript to set the value of the input box
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",radioBtto);
		Thread.sleep(5000);
		// Additional code to handle the browser can be added here
		
		// Close the browser
		driver.quit();
	}

}