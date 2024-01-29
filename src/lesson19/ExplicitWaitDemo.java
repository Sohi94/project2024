package lesson19;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo extends Base{
    @Test
    public void testAlert(){
        driver.get("file:///C:/Users/Owner/Downloads/waits.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

//        driver.findElement(By.id('alert')).click();

        wait.until(ExpectedConditions.alertIsPresent());
//  accept the alert
        driver.switchTo().alert().accept();
    }
    @Test
    public void testAlert2(){
        driver.get("file:///C:/Users/Owner/Downloads/Telegram%20Desktop/waits%20(2).html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

//        driver.findElement(By.id('populate-text')).click();

//        wait.until(ExpectedConditions.titleIs());
//  accept the alert
        driver.switchTo().alert().accept();
    }
}
