package com.ican.algorithm.Sort;

/**
 * Created by flingcoder
 * Date:4/28/2016
 * Description:
 */
public class QuickSortTest {
    public static void main(String[] args) {
        int num[] = {1,5,3,2,7,54,3,132};
        new QuickSortTest().quickSort(num,0,num.length-1);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
    }

    public void quickSort(int num[],int start,int end){
        if (start>=end)return;
        int left = start,right = end;
        int pivot = num[(start+end)/2];
        while (left<=right){
            while(left <= right && num[left] < pivot)
                left++;
            while(left <= right && num[right] > pivot)
                right--;
            if(left<=right){
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
                left++;
                right--;
            }
        }

        quickSort(num,start,right);
        quickSort(num,left,end);
    }
}
