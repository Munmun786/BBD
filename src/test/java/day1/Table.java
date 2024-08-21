package day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Table {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the chromedriver executable if necessary
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://blazedemo.com/reserve.php");

        // Find row size
        int row = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
        System.out.println("Number of rows: " + row);

        // Find column size
        int col = driver.findElements(By.xpath("//table[@class='table']//th")).size();
        System.out.println("Number of columns: " + col);

        // Initialize the variable to track the lowest price
        double lowestPrice = Double.MAX_VALUE;
        int lowestPriceRow = -1;

        // Iterate through each row (starting from the second row to skip the header)
        for (int r = 2; r <= row; r++) {
            WebElement priceElement = null;
            try {
                // Explicit wait to ensure the element is present
                priceElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@class='table']//tr[" + r + "]//td[6]")));

                String priceText = priceElement.getText();
                if (!priceText.isEmpty()) {
                    double price = Double.parseDouble(priceText.replace("$", ""));
                    if (price < lowestPrice) {
                        lowestPrice = price;
                        lowestPriceRow = r;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error finding price in row " + r + ": " + e.getMessage());
            }
        }

        // Check if a valid lowest price was found and select the option
        if (lowestPriceRow != -1) {
            try {
                WebElement selectOption = driver.findElement(By.xpath("//table[@class='table']//tr[" + lowestPriceRow + "]//td[1]//input[@type='submit']"));
                selectOption.click();
                System.out.println("Selected option in row with lowest price: $" + lowestPrice);
            } catch (Exception e) {
                System.out.println("Error selecting option in row " + lowestPriceRow + ": " + e.getMessage());
            }
        } else {
            System.out.println("No valid price found.");
        }

        Thread.sleep(5000);
        // Close the browser
        driver.quit();
    }
}
