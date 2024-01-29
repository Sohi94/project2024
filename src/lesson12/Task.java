package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(-1800, 0));
        driver.get("https://facebook.com");

        // Finding elements:
      //  WebElement usernameBox = driver.findElement(By.id("email"));
        // Do the action:
      //  usernameBox.sendKeys("myusername");
//        driver.findElement(By.className(""));
//        driver.findElement(By.name(""));
//        driver.findElement(By.xpath(""));
//        driver.findElement(By.cssSelector(""));
//        driver.findElement(By.linkText(""));
//        driver.findElement(By.partialLinkText(""));


    }
}
