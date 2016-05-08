package com.ican.Atomic;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Shadow on 2016/5/8.
 */
public class AtomicIntegerTest {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger();
        ai.set(10);
        System.out.println(ai.get());
        Lock lock = new ReentrantLock();
        Executors.newCachedThreadPool();
        ThreadLocal tl = new ThreadLocal();
        tl.get();
        tl.set(1);
        tl.remove();

    }
}
