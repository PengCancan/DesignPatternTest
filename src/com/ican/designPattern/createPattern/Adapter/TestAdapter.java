package com.ican.designPattern.createPattern.Adapter;

/**
 * Created by flingcoder on 3/17/2016.
 */
public class TestAdapter {
    public static void main(String[] args) {
        Source source = new SourceImpl();
        AdapterClass adapterClass = new AdapterClass(source);
        adapterClass.update("admin","20");
    }
}
