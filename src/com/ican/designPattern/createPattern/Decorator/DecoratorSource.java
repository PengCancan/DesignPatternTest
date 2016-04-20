package com.ican.designPattern.createPattern.Decorator;

/**
 * Created by flingcoder on 3/17/2016.
 */
public class DecoratorSource implements Source {
    Source source;
    public DecoratorSource(){
        this.source = new SourceImpl();
    }
    @Override
    public void update(String name, String date, String age) {
        enhance();
        source.update(name,date,age);
    }

    public void newFun(){
        System.out.println("new function");
    }
    private void enhance() {
        System.out.println("i am better");
    }
}
