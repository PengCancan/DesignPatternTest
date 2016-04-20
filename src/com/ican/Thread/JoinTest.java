package com.ican.Thread;

/**
 * Created by flingcoder
 * Date:4/14/2016
 * Description:
 */
public class JoinTest {
    public static void main(String[] args) {
        MT mt = new MT();
        Thread t1 = new Thread(mt);
        t1.start();
//        t1.setPriority(10);
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("main is finished");

    }
}

class MT implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "is running");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
