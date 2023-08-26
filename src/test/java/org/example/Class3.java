package org.example;

import org.testng.annotations.*;

public class Class3 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite- first priority");
    }

    @BeforeTest
    public  void beforeTest(){
        System.out.println("before test- will run before each test in the current class");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("class 3 before Class - will run before the current class from testng.xml");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod - The @BeforeMethod is specific to a class not to an XML file");
    }

    @Test(groups = {"smoketest"})
    public void Atest(){
        System.out.println("Atest");
    }

    @Test
    public void Btest(){
        System.out.println("Btest");
    }

    @Test(enabled = false)
    public void B_a_test(){
        System.out.println("B_a_test");
    }

    @Test
    public void B_b_test(){
        System.out.println("B_b_test");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod-The @AfterMethod is specific to a class not to an XML file");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("class 3 afterClass - will run after the current class from testng.xml");
    }

    @AfterTest
    public  void afterTest(){
        System.out.println("after test- will run after each test in the current class");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite - after execution of testng.xml");
    }
}
