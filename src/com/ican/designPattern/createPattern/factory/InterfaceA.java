package com.ican.designPattern.createPattern.factory;

/**
 * Created by flingcoder on 3/14/2016.
 */
public interface InterfaceA {
    public void create();
}

class MyFactoryA implements InterfaceA{

    @Override
    public void create() {
        System.out.println("create a");
    }
}

class MyFactoryB implements InterfaceA{

    @Override
    public void create() {
        System.out.println("create b");
    }
}

class MyFactory{
    public InterfaceA getProduct(String type){
        if("a".equals(type)){
            return new MyFactoryA();
        }
        else if("b".equals(type)){
            return new MyFactoryB();
        }return null;
    }
}

class TestFactory{
    public static void main(String[] args) {
        MyFactory myFactory = new MyFactory();
        myFactory.getProduct("b").create();

    }
}