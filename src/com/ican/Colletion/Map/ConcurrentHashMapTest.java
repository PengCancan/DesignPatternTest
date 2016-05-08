package com.ican.Colletion.Map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Shadow on 2016/5/1.
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap chm = new ConcurrentHashMap();
        System.out.println(new B());
    }
}
abstract  class A{
    private int a=1;
    private void get(){
        System.out.println(a);

    }
}

class B extends A{

}