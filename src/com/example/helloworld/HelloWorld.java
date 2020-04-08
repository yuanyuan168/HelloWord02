package com.example.helloworld;


import java.util.ArrayList;
import java.util.Date;

public class HelloWorld<f> {

    private static int num;

    public HelloWorld() {
    }

    public static void main(String[] args) {


        test();

     /*   Date date = new Date();
//synchronized ()*/
        method1();
    }

    public static void test() {
        System.out.println("Hello World！！111");

        new Date();
        //region Description
        System.out.println("Hello World！！222");
        ArrayList list = new ArrayList();
        list.add(0, 12);
        //endregion
        System.out.println(list);

        try {
            System.out.println("Hello World！！333");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //            ArrayList list10 =new ArrayList();
////                list10.add(0,12);
    public static void method1() {
        num = 10;

    }


}

