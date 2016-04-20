package com.ican.designPattern.createPattern.singleton;

public class Singleton {
    private static volatile Singleton singleton;//防止重排序
    private Singleton(){}
    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){//双重加锁检查
                singleton = new Singleton();
                return singleton;
            }
        }
        return singleton;
    }
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1= Singleton.getInstance();
        System.out.println(instance==instance1);
    }
}
