package com.course.testing.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("GroupsOnclass1中的stu1运行");
    }
    public void stu2(){
        System.out.println("GroupsOnclass1中的stu2运行");
    }
    public void stu3(){
        System.out.println("GroupsOnclass1中的stu3运行");
    }
}
