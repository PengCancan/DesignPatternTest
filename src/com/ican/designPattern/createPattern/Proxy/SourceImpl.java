package com.ican.designPattern.createPattern.Proxy;

import java.util.HashMap;

/**
 * Created by flingcoder on 3/17/2016.
 */
public class SourceImpl implements Source {
    @Override
    public void update(String name, String date, String age) {
        System.out.println(name + date + age);
    }
}
