package com.ican.SourceCodeAnalyze.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

/**
 * Created by Shadow on 2016/4/21.
 */
public class MapSourceCodeAnalyze {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Collections.synchronizedMap(hashMap);
        TreeMap tm = new TreeMap<>();
        tm.put(1,1);
        tm.entrySet();
    }
}
