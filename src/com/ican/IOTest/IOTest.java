package com.ican.IOTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by flingcoder
 * Date:4/12/2016
 * Description:
 */
public class IOTest {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader(new File("d://MyWorkSpace/1.txt"));
        BufferedReader br = new BufferedReader(fr);
        byte[] buff= new byte[1024];
        char[] chars = new char[1024];
        String len;
        ArrayList<String> ss = new ArrayList<>();

        FileWriter fw = new FileWriter(new File("d://MyworkSpace/2.txt"));
        BufferedWriter bw = new BufferedWriter(fw);
        while((len=br.readLine()) != null){
            System.out.println(len);
            ss.add(len);

        }

        Collections.sort(ss);
        Collections.reverse(ss);
        for(String s:ss){
            bw.write(s,0,s.length());
            bw.newLine();
            System.out.println(s);
        }
        bw.flush();
        fw.close();
        fr.close();
        bw.close();
        br.close();

    }
}
