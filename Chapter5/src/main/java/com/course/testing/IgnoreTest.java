package com.course.testing;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignorel 执行！");
    }
    //通过设置enables不执行，默认是true
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行！");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行！");
    }

}
