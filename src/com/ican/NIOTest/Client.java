package com.ican.NIOTest;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * Created by flingcoder
 * Date:5/12/2016
 * Description:
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Selector selector = null;
        //定义处理编码和解码的字符集
        //客户端SocketChannel
        SocketChannel sc = null;
        selector = Selector.open();
        InetSocketAddress isa = new InetSocketAddress("127.0.0.1", 5000);
        //调用open静态方法创建连接到指定主机的SocketChannel
        sc = SocketChannel.open(isa);
        //设置该sc以非阻塞方式工作
        sc.configureBlocking(false);
        //将SocketChannel对象注册到指定Selector
        sc.register(selector, SelectionKey.OP_WRITE);
        Buffer buffer = ByteBuffer.allocate(1024);
        ByteBuffer.wrap(new String("haha").getBytes());
        sc.write((ByteBuffer) buffer);
    }
}
