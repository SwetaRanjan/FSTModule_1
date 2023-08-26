package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Vegetable {

    @Test
    @Parameters({"ladyfinger"})
    public void test_1(String string)
    {
        System.out.println("vegetable is : " + string);
    }
}
