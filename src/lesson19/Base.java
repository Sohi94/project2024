package lesson19;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    protected WebDriver driver=null;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void quit() throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }
}
