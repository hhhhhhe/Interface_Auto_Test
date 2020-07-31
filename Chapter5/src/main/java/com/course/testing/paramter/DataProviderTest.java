package com.course.testing.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

// 另一种传参的方法——使用dataPrivider
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvide(String name, int age) {
        System.out.println("name = " + name + "; age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"张三", 10},
                {"李四", 20},
                {"王五", 30},
        };
        return o;
    }

    @Test(dataProvider = "menthod")
    public void test1(String name, int age) {
        System.out.println("name = " + name + "; age = " + age);
    }
    @Test(dataProvider = "menthod")
    public void test2(String name, int age) {
        System.out.println("name = " + name + "; age = " + age);
    }
    @DataProvider(name = "menthod")
    public Object[][] providerData(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"张三", 10}
            };
        }
        if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"张三", 10},
                    {"李四", 20},
                    {"王五", 30},
            };
        }

        return result;
    }

}

