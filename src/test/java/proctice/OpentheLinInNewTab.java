package proctice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpentheLinInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));

		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		//store windows id
		
		List<String> wind_Id= new ArrayList<String>(driver.getWindowHandles());
		
		//switch to reg page
		driver.switchTo().window(wind_Id.get(1));
		
		//return to home page
		
		driver.switchTo().window(wind_Id.get(0));
	}

}
