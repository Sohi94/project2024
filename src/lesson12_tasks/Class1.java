package lesson12_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
    public static void main(String[] args) throws InterruptedException {

        String url1 = "https://www.google.com/";

        System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver\\.chromedriver.exe");
        //create a webDriver object:
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url1);

        driver.findElement(By.id("APjFqb")).click();
        WebElement searchBox =driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("w3school");
        Thread.sleep(3000);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("W3Schools")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("JAVA")).click();

        WebElement w3SearchBox = driver.findElement(By.id("tnb-google-search-input"));

        w3SearchBox.sendKeys("HTML Forms");
        w3SearchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

         driver.quit();
    }
}
