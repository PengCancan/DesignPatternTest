package com.ican.SockeTest;

import java.io.*;
import java.net.Socket;

/**
 * Created by flingcoder
 * Date:4/12/2016
 * Description:
 */


public class MyCilent {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("127.0.0.1",5555);
        InputStream is = new FileInputStream(new File("d://MyWorkSpace/1.txt"));
        byte[] buff = new byte[1024];
        OutputStream os;
        os = s.getOutputStream();
        int len;
        while((len=is.read(buff)) != -1){
            os.write(buff,0,len);
        }
        is.close();
        os.close();
        s.close();
    }
}
