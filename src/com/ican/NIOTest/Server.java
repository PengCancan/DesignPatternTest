package com.ican.NIOTest;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.*;

/**
 * Created by flingcoder
 * Date:5/12/2016
 * Description:
 */
public class Server {
    public static void main(String[] args) throws IOException {
        InetSocketAddress isa = new InetSocketAddress("127.0.0.1",5000);
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        Buffer buffer = ByteBuffer.allocate(1000);
        serverSocketChannel.socket().bind(isa);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while(selector.select() > 0){
            for(SelectionKey selectKey : selector.selectedKeys()){
                selector.selectedKeys().remove(selectKey);
                if (selectKey.isAcceptable()){
                    SocketChannel channel = serverSocketChannel.accept();
                    channel.configureBlocking(false);
                    channel.register(selector,SelectionKey.OP_READ);
                    selectKey.interestOps(SelectionKey.OP_ACCEPT);
                    System.out.println("==========");
                }

                if(selectKey.isReadable()){
                    System.out.println("------------");
                    selectKey.cancel();
                }
            }
        }
    }
}
