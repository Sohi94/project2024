package lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeRunner {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        //URL launch
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("pass")).click();
        WebElement password = driver.findElement(By.id("pass"));

        password.sendKeys("Sokhiba");


    }
}
