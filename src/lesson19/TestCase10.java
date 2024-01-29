package lesson19;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TestCase10 extends Base {


    @Test()
    public void test1() throws InterruptedException {

        driver.get("https://www.google.com/");

        driver.findElement(By.id("APjFqb")).click();
        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("w3school");
        Thread.sleep(3000);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("W3Schools")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("JAVA")).click();

    }


    @Test
    public void test2() throws InterruptedException {


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
    public void test3() throws InterruptedException {

        driver.get("https://www.facebook.com/");
        WebElement emailOrPhoneNumber = driver.findElement(By.id("email"));
        emailOrPhoneNumber.sendKeys("(123)4567889");
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("DiAli");
        driver.findElement(By.id("u_0_4_Wo")).click();
    }


    @Test
    public void test4() {

        driver.get("https://www.letskodeit.com/practice");

        String car1 = "BMW";
        String car2 = "Benz";
        String car3 = "Honda";

        String radioButton = "BMW";

        switch (radioButton) {
            case "BMW":
                WebElement bmwRadioButton = driver.findElement(By.cssSelector("input#bmwradio"));
                bmwRadioButton.click();
                break;
            case "Benz":
                WebElement benzRadioButton = driver.findElement(By.cssSelector("input#benzradio"));
                benzRadioButton.click();
                break;
            case "Honda":
                WebElement hondaRadioButton = driver.findElement(By.cssSelector("input#hondaradio"));
                hondaRadioButton.click();
                break;
            default:
                System.out.println("you cannot click on more than one button");

        }
    }


    @Test
    public void test5() throws InterruptedException {

        driver.get("https://www.letskodeit.com/practice");
        WebElement textBox = driver.findElement(By.cssSelector("#autosuggest.inputs"));
        textBox.sendKeys("your comment");
        Thread.sleep(2000);

    }

    @Test
    public void test6() throws InterruptedException {

        driver.get("https://www.w3schools.com/java/exercise.asp?filename=exercise_syntax1");
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


    @Test
    public void test7() throws InterruptedException {

        driver.get("https://www.w3schools.com/java/exercise.asp?filename=exercise_classes8");
        WebElement input = driver.findElement(By.xpath("(// pre [@id='assignmentcontainer']/input[@class='editablesection'])"));
        input.sendKeys("extends");
        Thread.sleep(1000);
        driver.findElement(By.id("answerbutton")).click();


    }

    @Test
    public void test8() throws InterruptedException {

        driver.get("https://www.w3schools.com/java/exercise.asp?filename=exercise_data_types3");
        WebElement input = driver.findElement(By.xpath("(// pre [@id='assignmentcontainer']/input[@class='editablesection'])"));
        input.sendKeys("(int)");
        Thread.sleep(1000);
        driver.findElement(By.id("answerbutton")).click();
    }


    @Test
    public void test9() throws InterruptedException {

        driver.get("https://www.w3schools.com/java/exercise.asp?filename=exercise_data_types1");
        WebElement input1 = driver.findElement(By.xpath("( // pre [@id='assignmentcontainer']/ input[@class='editablesection'])[1]"));
        input1.sendKeys("int");
        Thread.sleep(1000);
        WebElement input2 = driver.findElement(By.xpath("(// pre [@id='assignmentcontainer']/input[@class='editablesection'])[2]"));
        input2.sendKeys("float");
        Thread.sleep(1000);
        WebElement input3 = driver.findElement(By.xpath("(// pre [@id='assignmentcontainer']/input[@class='editablesection'])[3]"));
        input3.sendKeys("char");
        Thread.sleep(1000);
        WebElement input4 = driver.findElement(By.xpath("(// pre [@id='assignmentcontainer']/input[@class='editablesection'])[4]"));
        input4.sendKeys("boolean");
        Thread.sleep(1000);
        WebElement input5 = driver.findElement(By.xpath("(// pre [@id='assignmentcontainer']/input[@class='editablesection'])[5]"));
        input5.sendKeys("String");
        Thread.sleep(1000);
        driver.findElement(By.id("answerbutton")).click();
    }


    @Test
    public void test10() throws InterruptedException {

        driver.get("https://www.w3schools.com/sql/exercise.asp?filename=exercise_join1");
        WebElement input1 = driver.findElement(By.xpath("(// pre [@id='assignmentcontainer']/input[@class='editablesection'])[1]"));
        input1.sendKeys("ON Orders.CustomerID");
        Thread.sleep(1000);
        WebElement input2 = driver.findElement(By.xpath("(// pre [@id='assignmentcontainer']/input[@class='editablesection'])[2]"));
        input2.sendKeys("Customers.CustomerID");
        Thread.sleep(1000);
        driver.findElement(By.id("answerbutton")).click();
    }


}

