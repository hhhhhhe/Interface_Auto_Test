package com.course.testing.suite;

import org.testng.annotations.Test;
//依赖测试：test2依赖测试test1，如果测试test1抛出异常test2不执行
public class DependTest {
    @Test
    public void test1(){
        System.out.println("这是被依赖的测试T1");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods={"test1"})
    public void test2(){
        System.out.println("这是依赖test1的测试");
    }

}
