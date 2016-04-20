package com.ican.algorithm;

import sun.misc.GC;

import java.util.Scanner;

/**
 * Created by flingcoder
 * Date:4/14/2016
 * Description:
 */
public class GCDTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println("greatest common divisor is :" + GCDTest.gcd(x,y));
        System.out.println("least common multiple is :" + GCDTest.lcm(x,y));
    }

    public static int gcd(int x,int y){
        if (x==0 && y==0)return 0;
        if (x>=0 && y>=0){
            if(y==0 && x!=0) {
                return x;
            }else if (x==0)
                return gcd(y,x);
            else if(y<x)
                return gcd(y,x%y);
            else if (x==y)
                return x;
            else
                return gcd(y,x);
        }
        return 1;
    }

    public static int lcm(int x,int y){
        return (x*y)/GCDTest.gcd(x,y);
    }
}
