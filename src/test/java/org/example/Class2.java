package org.example;

import org.testng.annotations.*;

public class Class2 {

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
        System.out.println("class 2 before Class - will run before the current class from testng.xml");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod - The @BeforeMethod is specific to a class not to an XML file");
    }

    @Test(enabled = false)
    public void Atest(){
        System.out.println("Atest");
    }

    @Test
    public void Btest(){
        System.out.println("Btest");
    }

    @Test(groups = {"smoketest"})
    public void Ctest(){
        System.out.println("Ctest");
    }

    @Test
    public void Dtest(){
        System.out.println("Dtest");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod-The @AfterMethod is specific to a class not to an XML file");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("class 2 afterClass - will run after the current class from testng.xml");
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
