package lesson12_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class Class_4 {
    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.costco.com/";

        System.setProperty("webdriver.edge.driver", "C:\\WebDriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.costco.com/");


        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size());

        for(WebElement link: allLinks){
            System.out.println(link.getAttribute("href"));
        }
//        driver.findElement(By.partialLinkText("Gift Card")).click();
//        driver.findElement(By.name("sortBy")).click();
//
//        Select sortBy = new Select(driver.findElement(By.name("sortBy")));
//        sortBy.selectByVisibleText("Newest");
//        Thread.sleep(2000);
//
//        driver.findElement(By.partialLinkText("MLB - San Francisco Giants")).click();
//        driver.findElement(By.name("plusQty")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.id("add-to-list-button")).click();
//        driver.navigate().back();
//
//        driver.quit();

    }
}
