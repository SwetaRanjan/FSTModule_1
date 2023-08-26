package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fruit {

    @Test
    @Parameters({"orange"})
    public void test_1(String string)
    {
        System.out.println("Fruit is : " + string);
    }
}
