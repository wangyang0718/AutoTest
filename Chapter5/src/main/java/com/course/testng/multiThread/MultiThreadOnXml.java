package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Thread Id : %S%n",Thread.currentThread().getId());  //printf格式化输出
    }

    @Test
    public void test2(){
        System.out.printf("Thread Id : %S%n",Thread.currentThread().getId());  //printf格式化输出
    }

    @Test
    public void test3(){
        System.out.printf("Thread Id : %S%n",Thread.currentThread().getId());  //printf格式化输出
    }
}
