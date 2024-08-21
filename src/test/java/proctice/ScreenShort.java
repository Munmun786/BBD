package proctice;

import java.io.File;
import java.io.FileOutputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.AddHasFullPageScreenshot;

public class ScreenShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		TakesScreenshot tS = (TakesScreenshot)driver;
//		File sourceFile=tS.getScreenshotAs(OutputType.FILE);
//		File targetFile = new File(System.getProperty("user.dir")+"\\Sceenshot\\fullpage.png");
//		sourceFile.renameTo(targetFile);
		
		
		WebElement sc= driver.findElement(By.xpath(null));
		File js = sc.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\Sceenshot\\fullpage.png");
//		sourceFile.renameTo(targetFile);
		
		
		driver.quit();
	}

}
