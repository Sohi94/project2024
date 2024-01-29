package lesson19;

import org.testng.Assert;

public class AssertionDemo {

    public void testWithAssertions(){
        String expect_AlerText = "Hello!";
        String alertText ="hello";

        double ex_Profit = 245.08;
        double totalProfit = 105.08;

        Assert.fail("Failed it for fun!");

    }
}
