package com.app;

import org.testng.annotations.*;

import java.sql.SQLOutput;

public class ninth {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("befor suite");
    }

    @BeforeClass
    public void beforclass(){
        System.out.println("Befor_class");
    }

    @BeforeTest
    public void setup(){
        System.out.println("befor setup");
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("before method");
    }

    @Test(priority = 1)
    public void test(){
        System.out.println("test passess");

    }

    @Test(priority = 2)
    public void sec_test(){
        System.out.println("second test");
    }

    @AfterMethod
    public void aftermaethod(){
        System.out.println("after method");
    }

    @AfterTest
    public void taerdown(){
        System.out.println("clean up");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("after class");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }
}
