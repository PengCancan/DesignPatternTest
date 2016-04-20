package com.ican.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by flingcoder
 * Date:4/20/2016
 * Description:
 */
public class HashMapMultiThread {

    Map<Integer,Integer> map = new HashMap<>();

    public void testLock(){
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    map.put(i, i);
                    System.out.println(Thread.currentThread().getName() + "====" + i);
                }
            }
        };

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    map.put(i, i);
                    System.out.println(Thread.currentThread().getName() + "====" + i);
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    map.put(i, i);
                    System.out.println(Thread.currentThread().getName() + "====" + i);
                }
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    System.out.println(Thread.currentThread().getName() + "====" + map.get(i));
                }
            }
        });
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {

                    System.out.println(Thread.currentThread().getName() + "====" + map.get(i));
                }
            }
        });
        Thread t6= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {

                    System.out.println(Thread.currentThread().getName() + "====" + map.get(i));
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
    public static void main(String[] args) {
        new HashMapMultiThread().testLock();
    }
}
