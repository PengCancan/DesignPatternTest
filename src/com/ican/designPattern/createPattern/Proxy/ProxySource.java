package com.ican.designPattern.createPattern.Proxy;

/**
 * Created by flingcoder on 3/17/2016.
 */
public class ProxySource implements Source {
    Source source;
    public ProxySource(){
        source = new SourceImpl();
    }
    @Override
    public void update(String name, String date, String age) {

        if("admin".equals(name)){
            source.update(name,date,age);
        }else {
            System.out.println("have no access to update");
        }
    }
}
