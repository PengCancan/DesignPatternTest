package com.ican.Colletion.Map;

import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by Shadow on 2016/5/1.
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap hm = new HashMap();

        new TestExt().test();
        System.out.println(hm.entrySet().size());
    }

    public int testResize(HashMap hm){
        for (int i = 0; i < 17; i++) {
            hm.put(i,i);
        }
        return hm.size();
    }

    void testDefault(){
        System.out.println("default");
    }
}

class TestExt{
    void test(){
        System.out.println("haha");
    }
}