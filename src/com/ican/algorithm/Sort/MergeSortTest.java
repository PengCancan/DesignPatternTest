package com.ican.algorithm.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

/**
 * Created by flingcoder
 * Date:4/28/2016
 * Description:
 */
public class MergeSortTest {
    public static void main(String[] args) {
//        int num[] = {1,2,5,3,57,61,45,31,54,3,45,7,8,9,43,786,345};
        int[] num = new int[100000];
        Random r = new Random();
        for (int i = 0; i < 100000; i++) {
            num[i] = r.nextInt(100000000);
        }
        int temp[] = new int[num.length];
        int temp1[] = new int[num.length];
        MergeSortTest mst = new MergeSortTest();

        System.out.println("the origin array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("========================");
        long before = System.currentTimeMillis();
        mst.mergeSort(num,0,num.length-1,temp);
        long after = System.currentTimeMillis();
        System.out.println("the asc array:" + (after - before) + "ms");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        //reverse the array
        System.out.println();
        System.out.println("========================");
        long before2 = System.currentTimeMillis();
        mst.mergeSort_1(num,0,num.length-1,temp1);
        long after2 = System.currentTimeMillis();
        System.out.println("the desc array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("merge sort:" + (after - before) + "ms");

        System.out.println();
        System.out.println("merge_1 sort:" + (after2 - before2) + "ms");


        long before1 = System.currentTimeMillis();
        Arrays.sort(num);
        long after1 = System.currentTimeMillis();
        System.out.println();
        System.out.println("inner sort:" + (after1 - before1) + "ms");
    }

    public void mergeSort(int[] num,int start,int end,int[] temp){
        if (start >= end)
            return;
        int left=start,right=end;
        int mid = (start+end)/2;
        mergeSort(num,left,mid,temp);
        mergeSort(num,mid+1,right,temp);
        merge(num,left,mid,right,temp);
    }
    public void merge(int num[],int start,int mid,int end,int temp[]){
        if (start >= end)
            return;
        int left=start,right=mid+1;
        int index = start;
        while(left<=mid && right <= end){
            if (num[left] < num[right]){
                temp[index++] = num[left++];
            }else{
                temp[index++] = num[right++];
            }
        }

        while(left <= mid){
            temp[index++] = num[left++];
        }

        while(right <= end){
            temp[index++] = num[right++];
        }

        for (index=start; index<=end ; index++) {
            num[index] = temp[index];
        }
    }

    public void  mergeSort_1(int[] num,int start,int end,int[] temp){
        if (start >= end)
            return;
        int left=start,right=end;
        int mid = start + (end-start)/2;
        mergeSort_1(num,left,mid,temp);
        mergeSort_1(num,mid+1,right,temp);
        merge_1(num,left,mid,right,temp);
    }

    private void merge_1(int num[],int start,int mid,int end,int temp[]) {
        if (start >= end)
            return;
        int left=start,right=mid+1;

        for (int i = start; i <= end; i++) {
            temp[i] = num[i];
        }

        for (int i = left; i <= end; i++) {
            if(left>mid) num[i] = temp[right++];
            else if(right > end) num[i] = temp[left++];
            else if(num[left] < num[right]) num[i] = temp[right++];
            else num[i] = temp[left++];
        }
    }
}
