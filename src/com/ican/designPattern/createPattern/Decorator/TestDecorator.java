package com.ican.designPattern.createPattern.Decorator;

/**
 * Created by flingcoder on 3/17/2016.
 */
public class TestDecorator {
    public static void main(String[] args) {
        DecoratorSource decoratorSource = new DecoratorSource();
        decoratorSource.update("haha","2016","18");
        decoratorSource.newFun();
    }
}
