package com.ican.Colletion.List;

import java.util.Collections;
import java.util.Vector;

/**
 * Created by flingcoder
 * Date:4/13/2016
 * Description:
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(32);
        v.add(23);
        Collections.sort(v);

        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
    }
}
