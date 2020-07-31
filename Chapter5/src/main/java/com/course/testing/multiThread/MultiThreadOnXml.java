package com.course.testing.multiThread;

import org.testng.annotations.Test;

//TestNg的多线程学习
public class MultiThreadOnXml {
    @Test
        public void test1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        }
}
