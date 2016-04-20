package com.ican.Thread;

/**
 * Created by flingcoder
 * Date:4/14/2016
 * Description:
 */
public class YieldTestProducerAndConsumer {
    public static void main(String[] args) {
        Producer p = new Producer();
        Consumer c = new Consumer();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}

class Producer implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("producing " + i);
            Thread.yield();
        }
    }
}


class Consumer implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("consuming " + i);
            Thread.yield();
        }
    }
}
