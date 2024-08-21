package day1;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver =new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		   driver.manage().window().maximize();
		   driver.get("http://www.deadlinkcity.com/");
		
		   
		    List<WebElement> links=driver.findElements(By.tagName("a"));
		    
		    for(WebElement linkElements : links) {
		    String	hrefValue=linkElements.getAttribute("href");
		    
		    if(hrefValue == null || hrefValue.isEmpty()) {
		    	System.out.println("not posible");
		    continue;
		    }
		    
		    try {
				URL linkUrl = new URL(hrefValue);
				  HttpsURLConnection conn= (HttpsURLConnection)linkUrl.openConnection();
				conn.connect();
				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefValue+"broken link");
				}else {
					System.out.println(hrefValue+ "not broken");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    
		    
		    }
	}

}
