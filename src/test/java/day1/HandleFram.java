package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		//frame1
		WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcom");
		driver.switchTo().defaultContent();
		
		//frame2
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("input[name='mytext2']")).sendKeys("serr");
		
		//frame 3
		
	 WebElement	frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
	       driver.switchTo().frame(frame3);
	       driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("rer");
		
		
		
		//inner Iframe
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
				driver.switchTo().defaultContent();
				
				driver.quit();
				
		
		
		
	}

}















//https://ui.vision/demo/webtest/frames/