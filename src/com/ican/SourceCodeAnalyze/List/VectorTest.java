package com.ican.SourceCodeAnalyze.List;

import java.util.Vector;

/**
 * Created by flingcoder
 * Date:4/28/2016
 * Description:
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add("abc");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
    }
}
