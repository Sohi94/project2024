package lesson12_tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_5 {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");






    }
}
