import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLink {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--Headless=new");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("size od the links "+ links.size());
	int onOfBrokenLink=0;
	for(WebElement linkElement : links) {
		
		String hrefValu=linkElement.getAttribute("href");
		
		if(hrefValu ==null || hrefValu.isEmpty()) {
			System.out.println("not posiblre");
			continue;
		}
	try {
		URL 	linkUrl=new URL(hrefValu);
		HttpURLConnection conn=(HttpURLConnection) linkUrl.openConnection();
		conn.connect();
		
		if(conn.getResponseCode() >=400) {
			System.out.println(hrefValu+"==> broken link");
			onOfBrokenLink++;
		}else {
			System.out.println(hrefValu+"==>not broken link");
		}
		
	} catch (Exception e) {
	
	}	

	
	}
		
		System.out.println("no of broken link"+onOfBrokenLink);
		
	}
	}