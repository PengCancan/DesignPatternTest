package com.ican.algorithm;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        String  text = "wo wo,shi shen,wo shi bu ";
        System.out.println(t.test(text));
    }

    public String test(String text){
        char[] ss = text.toCharArray();
        HashMap<String,Integer> hashMap = new HashMap<>();
        int k=0;
        for (int i = 0; i < ss.length; i++) {

            if (ss[i] == ' ' || ss[i] == ','){
                String s = text.substring(k,i);
                k = i+1;
                if(hashMap.containsKey(s)){
                    Integer integer = hashMap.get(s);
                    hashMap.put(s,integer+1);
                }else{
                    hashMap.put(s,1);
                }
            }
        }
        StringBuilder result = new StringBuilder();
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            result.append(key + ":" + value + " ");
        }
        return result.toString();
    }

}






















