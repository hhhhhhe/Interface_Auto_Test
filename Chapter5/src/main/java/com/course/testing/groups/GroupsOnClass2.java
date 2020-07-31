package com.course.testing.groups;

import org.testng.annotations.Test;
@Test(groups = "T")
public class GroupsOnClass2 {
        public void T1(){
            System.out.println("GroupsOnclass2中的运行T1");
        }
        public void T2(){
            System.out.println("GroupsOnclass2中的T2运行");
        }
        public void T3 (){
            System.out.println("GroupsOnclass2中的T3运行");
        }
    }


