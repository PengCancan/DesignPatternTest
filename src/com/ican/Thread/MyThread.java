package com.ican.Thread;

import static java.lang.Thread.currentThread;

/**
 * Created by flingcoder
 * Date:4/13/2016
 * Description:
 */
public class MyThread extends Thread {
    int i = 1;
    public synchronized void run() {
        while (i<10){
            try {
                Thread.sleep(2000);
                notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(currentThread().getName() + "---" + i++);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread1 thread1 = new Thread1();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(thread1);
        t1.start();
        t2.start();
    }
}
class Thread1 implements Runnable{
    @Override
    public synchronized void run() {
        int i = 1;
        while (i<11){
            try {
                notify();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(currentThread().getName() + "---" + i++);
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}