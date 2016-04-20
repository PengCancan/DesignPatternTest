package com.ican.designPattern.createPattern.Proxy;

import java.beans.beancontext.BeanContext;

/**
 * Created by flingcoder on 3/17/2016.
 */
public class TestProxy {
    public static void main(String[] args) {
        ProxySource proxySource = new ProxySource();
        proxySource.update("admin","2015","18");
        proxySource.update("jay","2015","18 ");
    }
}
