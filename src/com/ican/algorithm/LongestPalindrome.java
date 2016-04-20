package com.ican.algorithm;

/**
 * Created by flingcoder on 4/4/2016.
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        String a = "aabbaa";
//        int i = new LongestPalindrome().longestPalindrome(a);
//        System.out.println(i);
        System.out.println(new LongestPalindrome().longestPalindromeDP(a.toCharArray()));
    }

    public int  longestPalindrome(String a){
        int len = a.length();
        boolean[][] isPal=new boolean[len][len];
        int i,j,max=0;
        for (i = 1; i < len; i++) {
            j = i;
            while(j>0){
                if (a.charAt(i)==a.charAt(j) && ((i-j>2) || isPal[j][i-1])){
                    isPal[j][i] = true;
                    max = Math.max(max,i-j+1);
                }
                j--;
            }
        }
        return max;
    }

    public String longestPalindromeDP(char[] s) {

        int n = s.length;

        int longestBegin = 0;

        int maxLen = 1;

        boolean table[][] = new boolean[n][n];

        for (int i = 0; i < n; i++) {

            table[i][i] = true;   //前期的初始化

        }

        for (int i = 0; i < n-1; i++) {

            if (s[i] == s[i+1]) {      //相邻的两个元素为回文串

                table[i][i+1] = true; //前期的初始化

                longestBegin = i;

                maxLen = 2;

            }

        }

        for (int len = 3; len <= n; len++) {  //子字符串的长度

            for (int i = 0; i < n-len+1; i++) { //字符串的起始位置

                int j = i+len-1;                //字符串的结束位置

                if (s[i] == s[j] && table[i+1][j-1]) {  //如果table[i+1][j-1]为回文字符串那么table[i][j]也是回文字符串

                    table[i][j] = true;

                    longestBegin = i;

                    maxLen = len;

                }

            }

        }

        return new String(s).substring(longestBegin, maxLen);


    }
}
