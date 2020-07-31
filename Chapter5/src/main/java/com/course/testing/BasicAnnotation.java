package com.course.testing;

import org.testng.annotations.*;

public class BasicAnnotation {
    //基本的TestNg的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforMethod这是测试方法执行前执行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是测试方法执行后执行");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这是在类运行之前的运行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行之后的运行的");
    }
    //在类执行之前运动的，一个suite可以包含多个class
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }

}
