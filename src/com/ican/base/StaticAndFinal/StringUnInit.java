package com.ican.base.StaticAndFinal;

/**
 * Created by flingcoder
 * Date:4/12/2016
 * Description:
 */
public class StringUnInit {
    public static void main(String[] args) {
        String a = new String();
        int[] b = new int[1024];
//        System.out.println("s=" +a);
        char c = 'A';
        String st = "a123";
        char[] chars = {'1','2','3'};
        byte bb = 127;
        int  i = 1234;
        String s1 = "abc";
        String s2 = s1;
//        String substring = s2.substring(1);
//        String replace = s2.replace('a', 'l');
//        System.out.println((s2.replace('l','d').getClass().getMethods()));
//        System.out.println(replace.getClass());
//        System.out.println(replace);
//        System.out.println(s1);
//        System.out.println(String.valueOf(i).toUpperCase());
//        System.out.println(Character.codePointAt(chars,0));
//        System.out.println(Character.codePointAt(st,0));
//        System.out.println(Integer.valueOf(String.valueOf(chars)));
    }
}
interface  A{
    void fun();
    int a=0;
}