package org.example;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listners_1_implementation.class)
public class Listner_2 {

    @Test
    public void pass()
    {
        Assert.assertTrue(true);
    }
    @Test
    public void fail()
    {
        Assert.assertTrue(false);
    }
    @Test
    public void skip()
    {
        System.out.println("skipped");
    }

}
