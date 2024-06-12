package automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in");

        System.out.println("Browser opened successfully.");

        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
        System.out.println("Selenium search.");
        driver.findElement(By.partialLinkText("selenium")).click();
        driver.findElement(By.partialLinkText("Download")).click();
        driver.quit();
        System.out.println("Browser quit successfully.");
    }
}
