package com.ican.designPattern.createPattern.Decorator;

import java.io.*;

/**
 * Created by Shadow on 2016/5/1.
 */
public class IODecorator {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream is = new FileInputStream(new File(""));
        BufferedInputStream bis = new BufferedInputStream(is);
    }
}
