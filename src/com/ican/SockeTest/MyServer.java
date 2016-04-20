package com.ican.SockeTest;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by flingcoder
 * Date:4/12/2016
 * Description:
 */
public class MyServer {
    public static void main(String[] args)throws Exception {
        ServerSocket ss = new ServerSocket(5555);
        byte[] buff = new byte[1024];
        InputStream is = new ByteArrayInputStream(buff);
        int len;
        while (true) {
            Socket accept = ss.accept();
            is = accept.getInputStream();

            while ((len = is.read(buff)) != -1) {
                System.out.println(len);
                System.out.println(new String(buff));

            }
            is.close();
            accept.close();
        }
    }
}
