package com.ican.Thread;

/**
 * Created by flingcoder
 * Date:4/13/2016
 * Description:
 */
public class DeadLock implements Runnable {
    Object obj1;
    Object obj2;

    public DeadLock(Object o1, Object o2) {
        this.obj1 = o1;
        this.obj2 = o2;
    }

    @Override
    public synchronized void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + "---obj1 getting lock");
        synchronized (obj1) {
            System.out.println(name + "---obj1 get lock");
            work();
            System.out.println(name + "---obj2 getting lock");
            synchronized (obj2) {
                System.out.println(name + "---obj2 get lock");
                work();
            }
            System.out.println(name + "---obj2 release lock");
        }
//        System.out.println(name + "---obj1 release lock");
//        System.out.println(name + "---obj2 getting lock");
//        synchronized (obj2) {
//            System.out.println(name + "---obj2 get lock");
//            work();
//        }
//        System.out.println(name + "---obj2 release lock");
    }


    private void work() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();

        DeadLock d1 = new DeadLock(o1,o2);
        DeadLock d2 =  new DeadLock(o2,o1);
//        DeadLock d3 = new DeadLock(o3,o1);
        Thread t1 = new Thread(d1,"t1");
        Thread t2 = new Thread(d2,"t2");
//        Thread t3 = new Thread(d3,"t3");
        t1.start();
        Thread.sleep(3000);
        t2.start();
        Thread.sleep(3000);
//        t3.start();
    }

}
