package com.ican.NIOTest;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by flingcoder
 * Date:4/13/2016
 * Description:
 */
public class NIOServer {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf = new RandomAccessFile("d://MyWorkSpace/1.txt", "rw");
        FileChannel channel = raf.getChannel();
        ByteBuffer bb = ByteBuffer.allocate(48);
        int len = channel.read(bb);
        while (len != -1){

            System.out.println("Read" + len);
            bb.flip();
            byte[] array = bb.array();
            System.out.println(new String(array));
            while(bb.hasRemaining()){
                System.out.println((char)bb.get());
            }
            bb.clear();
            len = channel.read(bb);
        }
        raf.close();
    }
}
