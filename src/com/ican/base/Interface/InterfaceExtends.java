package com.ican.base.Interface;

import com.ican.Colletion.Map.ConcurrentHashMapTest;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Shadow on 2016/5/6.
 */
public class InterfaceExtends  {
    public static void main(String[] args) {
        Wings p = new Plane();
        InterfaceExtends.test(p);
    }

    public static void test(Wings p){
        p.fly();
    }
}

interface Wings{
    void fly();
}

class Plane implements Wings{
    @Override
    public void fly() {
        System.out.println("flying --------");
    }

    public void slide(){
        System.out.println("slide----------");
    }
}
