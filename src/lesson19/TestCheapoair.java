package lesson19;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCheapoair extends Base {


   // @Test()
    public void selectFrom() throws InterruptedException {

        driver.get("https://www.cheapoair.com");

        driver.findElement(By.id("from0")).click();
        WebElement from = driver.findElement(By.id("from0"));
        from.sendKeys("JFK");
    }

    @Test()
    public void destinationTo() throws InterruptedException {

        driver.get("https://www.cheapoair.com");
        Thread.sleep(1000);
        driver.findElement(By.id("to0")).click();
        Thread.sleep(2000);
        WebElement destinationTo = driver.findElement(By.id("to0"));
        destinationTo.sendKeys(Keys.CONTROL + "A");
        destinationTo.sendKeys(Keys.DELETE);
        destinationTo.sendKeys("CUN");
        destinationTo.sendKeys(Keys.ENTER);
    }

   // @Test()
    public void calendar() throws InterruptedException {

        driver.get("https://www.cheapoair.com");
        driver.findElement(By.id("cal0")).click();
        WebElement departDate = driver.findElement(By.xpath("//a[@aria-label='30 January 2024']"));
        departDate.click();
        driver.findElement(By.id("cal1")).click();
        Thread.sleep(1000);
        WebElement returnDate = driver.findElement(By.xpath("//a[@aria-label='24 February 2024']"));
        returnDate.sendKeys(Keys.ENTER);
    }

    @Test()
    public void traveller() throws InterruptedException {
        driver.get("https://www.cheapoair.com");


        WebElement adults = driver.findElement(By.xpath("//a[@id='travellerButton']"));
        adults.click();
        //Thread.sleep(1000);
        for (int i = 0; i < 1; i++) {
            driver.findElement(By.id("addadults")).click();
        }

        driver.findElement(By.id("addchild"));
        //Thread.sleep(1000);
        for(int i=0;i<2;i++) {
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
    }

    @Test()
    public void searchButton() throws InterruptedException {
        driver.get("https://www.cheapoair.com");
        driver.findElement(By.id("searchNow")).click();
    }


   // @Test()
    public void searchFlight() throws InterruptedException {
        driver.get("https://www.cheapoair.com");
        driver.findElement(By.xpath("//button[@aria-label='Select this contract of 443.24 fare and move to Payment Page ]")).click();
    }
    @Test()
    public void coach() throws InterruptedException {
        driver.get("https://www.cheapoair.com");
        driver.findElement(By.id("combo1")).click();
        // id="Class-combo1-2"
        // id="listbox1"
        // id="dropdown-ariaLabel-Class"
        WebElement coach = driver.findElement(By.id("combo1"));
        coach.click();
        for(int i=0;i<3;i++) {
            coach.sendKeys(Keys.ARROW_DOWN);
        }
        coach.sendKeys(Keys.ENTER);
    }
    @Test()
    public void preferredAirline() throws InterruptedException {
        driver.get("https://www.cheapoair.com");
        driver.findElement(By.id("preferredAirline")).click();
        WebElement airline = driver.findElement(By.id("preferredAirline"));
        airline.sendKeys("American Airlines");
        //airline.sendKeys(Keys.ARROW_DOWN);
        airline.click();
    }

    @Test()
    public void directFlight() throws InterruptedException {
        driver.get("https://www.cheapoair.com");
        driver.findElement(By.id("directFlightCheckId")).click();
    }

}
