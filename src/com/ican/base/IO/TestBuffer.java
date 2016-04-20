package com.ican.base.IO;

import java.nio.CharBuffer;

/**
 * Created by flingcoder on 3/24/2016.
 */
public class TestBuffer {
    public static void main(String[] args) {
        CharBuffer b = CharBuffer.allocate(8);
        b.put('a');
        b.put('b');
        b.flip();
        System.out.println(b.get());
        b.clear();
        b.put('c');
        System.out.println(b.get(1));
        System.out.println(b.position());
    }
}
