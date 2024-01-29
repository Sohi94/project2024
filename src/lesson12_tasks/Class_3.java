package lesson12_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_3 {
    public static void main(String[] args) throws InterruptedException {

        String url1 = "https://www.w3schools.com/";

        System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver\\.chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url1);
        Thread.sleep(2000);
        driver.findElement(By.linkText("JAVA")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Start the Exercise")).click();
        Thread.sleep(2000);
        WebElement input1 = driver.findElement(By.xpath("( // pre [@id='assignmentcontainer']/ input[@class='editablesection'])[1]"));
        input1.click();
        Thread.sleep(1000);
        input1.sendKeys("System");
        Thread.sleep(2000);

        WebElement input2 = driver.findElement(By.xpath("(// pre [@id='assignmentcontainer']/input[@class='editablesection'])[2]"));
        input2.sendKeys("out");
        Thread.sleep(2000);

        WebElement input3 = driver.findElement(By.xpath("(// pre [@id='assignmentcontainer']/input[@class='editablesection'])[3]"));
        input3.sendKeys("println");
        Thread.sleep(2000);

        driver.findElement(By.id("answerbutton")).click();

    }
}
