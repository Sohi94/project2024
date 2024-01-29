package lesson19;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class Practice extends Base{

   // @Test
    public void test2() throws InterruptedException {

        driver = new ChromeDriver();//opens Chrome browser
        driver.manage().window().maximize();

        // open the webSite
        driver.get("https://www.costco.com/");
        driver.findElement(By.id("header_sign_in")).click();
        Thread.sleep(3000);
        WebElement emailAddress = driver.findElement(By.id("signInName"));
        emailAddress.sendKeys("Sokhiba");
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("DIA");
    }


    @Test
    public void testCaseOne(String browser) {
        System.out.println("browser passed as :- " + browser);
    }

    @Parameters({ "username", "password" })
    @Test
    public void testCaseTwo(String username, String password) {
        System.out.println("Parameter for User Name passed as :- " + username);
        System.out.println("Parameter for Password passed as :- " + password);
    }
}
