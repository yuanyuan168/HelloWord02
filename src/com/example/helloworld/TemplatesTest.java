package com.example.helloworld;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Yuehy
 * @create 2020-04-08 19:26
 */
public class TemplatesTest {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        String[] arr = new java.lang.String[]{"tom", "jerry", "hanmeimei ", "lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {
            System.out.println(list);
        }
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        if (list == null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }
        if (list != null) {

        }


    }

    private static final Customer CUST = new Customer();
    /**
    *heh
    */
    private String dfd;
/**
 * fd
 */
 private int fd;


}
