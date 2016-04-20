package com.ican.IOTest;

import java.io.*;

/**
 * Created by flingcoder
 * Date:4/12/2016
 * Description:
 */
public class ByteFlowIOTest {
    public static void main(String[] args) throws Exception{
        InputStream is = new FileInputStream(new File("d://MyWorkSpace/1.txt"));
        OutputStream os = new FileOutputStream(new File("d://MyWorkSpace/3.txt"));
        byte[] buff = new byte[1024];
        int len;
        while((len=is.read(buff)) != -1){
            System.out.println(len);
            System.out.println(new String(buff));
            os.write(buff,0,len);
        }
        is.close();
        os.close();
    }
}
