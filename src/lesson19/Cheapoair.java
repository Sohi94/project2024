package lesson19;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Cheapoair extends Base {

    @Test()
    public void selectFrom() throws InterruptedException {


        driver.get("https://www.cheapoair.com");
//        Thread.sleep(3000);
//        driver.findElement(By.id("roundTrip")).click();
//        Thread.sleep(3000);

//        PREFERRED AIRLINE
        Thread.sleep(2000);
        driver.findElement(By.id("preferredAirline")).click();
        WebElement airline = driver.findElement(By.id("preferredAirline"));
        airline.sendKeys("American Airlines");
        airline.click();
        Thread.sleep(2000);


//        COACH
        driver.findElement(By.id("combo1")).click();
        Thread.sleep(2000);
        WebElement coach = driver.findElement(By.id("combo1"));
        coach.click();
        for(int i=0;i<4;i++) {
            coach.sendKeys(Keys.ARROW_DOWN);
        }
        coach.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

//        DIRECT_Flight
        driver.findElement(By.id("directFlightCheckId")).click();
        Thread.sleep(2000);

//        FROM
        driver.findElement(By.id("from0")).click();
        WebElement from = driver.findElement(By.id("from0"));
        from.sendKeys("JFK");
//        TO
        Thread.sleep(1000);
        driver.findElement(By.id("to0")).click();
        Thread.sleep(2000);
        WebElement destinationTo = driver.findElement(By.id("to0"));
        destinationTo.sendKeys(Keys.CONTROL + "A");
        destinationTo.sendKeys(Keys.DELETE);
        destinationTo.sendKeys("CUN");
        destinationTo.sendKeys(Keys.ENTER);
//        CALENDAR
        driver.findElement(By.id("cal0")).click();
        WebElement departDate = driver.findElement(By.xpath("//a[@aria-label='30 January 2024']"));
        departDate.click();
        driver.findElement(By.id("cal1")).click();
        Thread.sleep(1000);
        WebElement returnDate = driver.findElement(By.xpath("//a[@aria-label='24 February 2024']"));
        returnDate.sendKeys(Keys.ENTER);
//        TRAVELLER
        WebElement adults = driver.findElement(By.xpath("//a[@id='travellerButton']"));
        adults.click();
        //Thread.sleep(1000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(By.id("addadults")).click();
        }

        driver.findElement(By.id("addchild"));
        //Thread.sleep(1000);
        for (int i = 0; i < 2; i++) {
            driver.findElement(By.id("addchild")).click();
        }

        WebElement childAge = driver.findElement(By.id("select0"));
        childAge.click();

        Select childAge1 = new Select(childAge.findElement(By.name("ChildrenAge")));
        childAge1.selectByIndex(1);
        Thread.sleep(3000);
        WebElement childAge2 = driver.findElement(By.id("select1"));
        childAge2.click();
        Select child2Age = new Select(childAge2.findElement(By.name("ChildrenAge")));
        child2Age.selectByIndex(5);
        Thread.sleep(3000);
//         SEARCH FLIGHT
        driver.findElement(By.id("searchNow")).click();
        Thread.sleep(20000);

    }
}
