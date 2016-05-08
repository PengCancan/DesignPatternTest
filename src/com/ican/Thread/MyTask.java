package com.ican.Thread;

/**
 * Created by flingcoder
 * Date:4/27/2016
 * Description:
 */
public class MyTask implements Runnable{

    int num;
    public MyTask(int i) {
        this.num = i;
    }

    @Override
    public void run() {
        System.out.println("task-" + num + "init");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task-" + num + "finished");
    }
}
