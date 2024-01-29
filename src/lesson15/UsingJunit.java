package lesson15;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingJunit extends Base{

    // JUnit-
    // TestNG- is used for testing by testers


    @Test
    public void test1() {
        driver = new ChromeDriver();//opens chrome browser
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");


    }


    @Test
    public void test2() {

        driver = new ChromeDriver();//opens chrome browser
        driver.manage().window().maximize();

        // open the webSite
        driver.get("https://www.facebook.com/");
    }
}

