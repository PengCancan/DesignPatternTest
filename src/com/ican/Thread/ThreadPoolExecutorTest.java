package com.ican.Thread;

import com.sun.corba.se.impl.orbutil.threadpool.WorkQueueImpl;

import java.util.concurrent.*;

/**
 * Created by flingcoder
 * Date:4/27/2016
 * Description:
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ThreadPoolExecutor tpl = new ThreadPoolExecutor(11,20,60,TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(10));
        for (int i = 0; i < 20; i++) {
            MyTask mt = new MyTask(i);
            tpl.execute(mt);
            System.out.println("thread nums in threadpool: " + tpl.getPoolSize()
                    + "   tasks in queue:" + tpl.getQueue().size()
                    + "   completed tasks:" + tpl.getCompletedTaskCount());
        }
        tpl.shutdown();
    }
}
