package com.ican.NIOTest;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

/**
 * Created by flingcoder
 * Date:5/12/2016
 * Description:
 */
public class FileChannel {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("d://MyWorkSpace/1.txt", "rw");
        java.nio.channels.FileChannel channel = raf.getChannel();
        ByteBuffer bb = ByteBuffer.allocate(48);
        int len = channel.read(bb);
        while (len != -1){

            System.out.println("Read" + len);
            bb.flip();
//            byte[] array = bb.array();
//            System.out.println(new String(array));
            while(bb.hasRemaining()){
                System.out.print((char)bb.get());
            }
            bb.clear();
            len = channel.read(bb);
        }
        raf.close();
    }
}
