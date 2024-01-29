package lesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxRunner {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/");


    }
}
