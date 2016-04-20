package com.ican.algorithm;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by flingcoder on 4/4/2016.
 * Description:求第k位小的数
 */
public class GetKmin {
    public static void main(String[] args) {
        int[] a = {1,2,3,65,43,4};
        int count = 0,x=8421;
        while(x!=0){
            count++;
            x = x&(x-1);
        }
        HashSet h = new HashSet();
        Iterator iterator = h.iterator();
        iterator.hasNext();
        System.out.println(count);
        System.out.println(new GetKmin().get(a,6));

    }

    public int get(int[] a,int k){
        return quickSort(a,0,a.length-1,k);
    }

    public int quickSort(int[] a,int low,int high,int k){
        int i = low;
        int j = high;
        int temp = a[i];
            while(i<j){
            while (i<j&&a[j] > temp){
                j--;
            }
            if(i<j)
                a[i++] = a[j];
            while (i<j && a[i] < temp)
                i++;
            if(i<j)
                a[j--] = a[i];
        }

        a[i] = temp;
        if((i+1) == k){
            return temp;
        }else if((i+1) < k){
            return quickSort(a,i+1,high,k);
        }else
            return quickSort(a,low,i-1,k);
    }
}
