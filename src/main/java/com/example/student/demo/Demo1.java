package com.example.student.demo;

public class Demo1 {

    private int i = 1;

    static int n = 2;

    static Demo1 de = new Demo1();

    public static void main(String[] args) {

        int a =1;
        int b =1;

        Demo1 demo1 = new Demo1();

        demo1.i = 2;
//      demo1.n

        Demo1.n = 3;

        System.out.println(Demo1.n);
    }
}
