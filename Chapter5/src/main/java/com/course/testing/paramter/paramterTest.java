package com.course.testing.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//testng的参数学习
public class paramterTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name="+name+"age="+age);

    }

}
