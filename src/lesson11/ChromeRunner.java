package lesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class ChromeRunner {
    public static void main(String[] args) {

        String url1 = "https://www.google.com/";

        System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver\\.chromedriver.exe");
        //create a webDriver object:
        WebDriver driver = new ChromeDriver();//opens chrome browser
        driver.manage().window().maximize();

        // open the webSite
        driver.get(url1);


    }
}
