package com.ican.Colletion.Map;

import java.util.*;

/**
 * Created by Shadow on 2016/4/25.
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();

        tm.put(1, 1);
        tm.put(2,3);
        tm.put(3,4);
        tm.put(11,1);
        tm.put(10,2);
        tm.ceilingEntry(1);
        Map m = tm.subMap(1,6);
        Set s = m.entrySet();
        Iterator i = s.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        // creating maps
        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
        NavigableMap<Integer, String> treemapincl = new TreeMap<Integer, String>();

        // populating tree map
        treemap.put(2, "two");
        treemap.put(1, "one");
        treemap.put(3, "three");
        treemap.put(6, "six");
        treemap.put(5, "five");

        System.out.println("Getting a portion of the map");
        treemapincl=treemap.subMap(1, true, 3, true);
        System.out.println("Sub map values: "+treemapincl);
    }
}
