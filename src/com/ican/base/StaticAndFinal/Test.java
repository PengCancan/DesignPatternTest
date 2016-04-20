package com.ican.base.StaticAndFinal;

/**
 * Created by flingcoder on 3/23/2016.
 */
public class Test {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        MyClass m2 = new MyClass();
        MyClass m3 = new MyClass();
        m1.b = 1;
        System.out.println(m1.a);
        System.out.println(m2.a);
        System.out.println(m1.b);
        System.out.println(m2.b);
        System.out.println(m3.b);
    }
}

class MyClass{
    public final double a = Math.random();
    public static double b = Math.random();
}