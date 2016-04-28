package com.ican.base.String;


/**
 * Created by flingcoder
 * Date:4/27/2016
 * Description:
 */
public class StringToInteger {
    public static void main(String[] args) {
        String num = "1243798789";
        int i = Integer.parseInt(num);
        System.out.println(i);
        Integer integer1 = Integer.valueOf(num);

        System.out.println(integer1 + 1);
    }
}
