package org.example;

import org.testng.annotations.*;

public class Class1
{
    /**
     *   WebDriverManager driverManager;
     *   WebDriverManager.chromedriver().setup();
     *   driverManager = new ChromeDriverManager();
     */

    /*
     * first priority given to before suite
     */
    @BeforeSuite
    public void before_suite(){
        System.out.println("before suite - before the execution of all the test cases defined in the folder.");
    }
    @AfterSuite
    public void after_suite(){
        System.out.println("after suite - executed after_suite method executed after the execution of XML file");
    }
    /*
     * You have a requirement when you automate the test cases, you want your data to be deleted first which you submitted.
     * For example, when you run the test case, you will fill the details in a form, and the data is saved in a database.
     * When you run the test case again, then you get an error that "data already exists".
     * */
    @BeforeTest
    public void before_test(){
        System.out.println("before test - be executed first before any test belonging to that folder.");
    }

    /*
    * Once the execution is completed, there is a requirement to remove the cookies,
    * delete the process or close the connection, so @AfterTest annotated method is used for this purpose.
    * */
    @AfterTest
    public void after_test(){
        System.out.println("after test - executed after the execution of all the test methods of the available classes which" +
                " are kept inside the tag in the testng.xml file in the suite.");
    }

    /*
    * @BeforeClass: The @BeforeClass annotated method runs before the execution of test methods in a current class.
    * */
    @BeforeClass
    public void before_class() {
        System.out.println("before class - runs before the execution of test methods in a current class.");
    }
    /*
    * @AfterClass: The @AfterClass annotated method will be executed after all the test methods of a current class have been invoked.
    * */
    @AfterClass
    public void after_class() {
        System.out.println("after class - will be executed after all the test methods of a current class have been invoked.");
    }

    /*
    * The @BeforeMethod is specific to a class not to an XML file. The @BeforeMethod annotated method will be
    *  invoked before the execution of each test method where the test method is nothing but a test case. Suppose
    * there are four test methods in a class then the @BeforeMethod annotated method is executed before the execution of
    *  each test method. If there are four test methods, then four times @BeforeMethod annotated method will be invoked.
    * */
    @BeforeMethod
    public void before_method() {
        System.out.println("before method - executes before all the method present in the class");
    }

    /*
    * The @AfterMethod annotation is specific to a class not to an XML file. The @AfterMethod annotated method will
    * be invoked after the execution of each test method. Suppose there are four test methods means that @AfterMethod annotated method will be executed four times.
    * */
    @AfterMethod
    public void after_method() {
        System.out.println("after method executes after all the method present in the class");
    }

    /*
    * For example, student_id, student_name, student_address are the details of a student, and all these details are added in a same group, i.e., "student details".
    * @BeforeGroups: The @BeforeGroups annotated method will run only once before all the test methods belonging to a specified group have been executed.
    * */
    @BeforeGroups(" 1 group")
    public void before_groups() {
        System.out.println("before_groups will be executed before all tests belonging to the specified group-1");
    }


    @BeforeGroups(" 2 group")
    public void before_group() {
        System.out.println("before_groups will be executed before all tests belonging to the specified group-2");
    }
    /*
    * We have learned about the @BeforeGroups annotation which executes the @BeforeGroups annotated method before the execution
    * of the test methods belonging to the group specified in the parameter of the @BeforeGroups annotation.
    * @AfterGroups: The @AfterGroups annotated method will run only once after the execution of all the test methods of a specified group.
    * */
    @AfterGroups
    public void after_groups() {
        System.out.println("after groups will be executed after all the tests belonging to a specified group-1");
    }

    @AfterGroups
    public void after_group() {
        System.out.println("after groups will be executed after all the tests belonging to a specified group-2");
    }
    @Test
    public void a_test(){
        System.out.println("a test");
    }

    @Test
    public void b_test(){
        System.out.println("b test");
    }

    @Test(groups="2 group")
    public void c_test(){
        System.out.println("c test");
    }

    @Test(groups="1 group")
    public void d_test(){
        System.out.println("d test");
    }

    @Test(groups="1 group")
    public void e_test(){
        System.out.println("e test");
    }

    @Test(groups="2 group")
    public void f_test(){
        System.out.println("f test");
    }

}
