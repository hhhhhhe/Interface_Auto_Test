package com.course.testing;

import org.testng.annotations.Test;

/***
 * 什么时候会使用到异常测试
 * 在什么期望结果为某一个异常的时候
 * 比如：我们传入了某些不合法的参数，程序抛出了异常
 * 也就是说我的预期结果就是一个异常
 */
//这是一个测试结果会失败的异常测试
public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    //这是一个成功的一场测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
