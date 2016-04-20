package com.ican.designPattern.createPattern.Adapter;

/**
 * Created by flingcoder on 3/17/2016.
 */
public class AdapterClass implements NewSource {
    Source source;
    public AdapterClass(Source source){
        this.source = source;
    }
    @Override
    public void update(String name, String age) {
        source.update(name,"2016",age);
    }

}
