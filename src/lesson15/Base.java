package lesson15;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    protected WebDriver driver=null;

    @Before
    public void setUp(){
        System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver\\.chromedriver.exe");
        //create a webDriver object:
        driver = new ChromeDriver();//opens chrome browser
        driver.manage().window().maximize();
    }

    @After
    public void tesrdown() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }

}
