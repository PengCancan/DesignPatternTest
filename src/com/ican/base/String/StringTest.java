package com.ican.base.String;

/**
 * Created by flingcoder
 * Date:4/15/2016
 * Description:
 */
public class StringTest {

    static{
        int a = 1;
        String s = "jay";
        System.out.println(a);
    }
    public static void main(String[] args) {
        String a = "abc";
        String b = a;
        String c = new String(a);
        String d = new String("abc");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==d);
        System.out.println(null == null);
    }
}
