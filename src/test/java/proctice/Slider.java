package proctice;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		
		System.out.println("find the lenght"+ min_slider.getLocation());
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(min_slider, 100, 249).perform();
		
		
	}

}
