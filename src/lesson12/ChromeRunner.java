package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeRunner {
    public static void main(String[] args) throws InterruptedException {

        String url1 = "https://www.google.com/";
        String url2 = "https://www.facebook.com/";

        System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver\\.chromedriver.exe");
        //create a webDriver object:
        WebDriver driver = new ChromeDriver();//opens chrome browser
        driver.manage().window().maximize();

        // open the webSite
        driver.get(url1);
        Thread.sleep(2000);
        driver.navigate().to(url2);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.getPageSource();
       // driver.close();
        driver.quit();
       // driver.findElement(By.id());
        /*driver.findElement(By.className());
        driver.findElement(By.cssSelector());
        driver.findElement(By.name());
*/


    }
}
