package com.leetcode.easy;

public class Solution {
    public static void main(String[] args) {
       String str = "adcde";
        System.out.println(getIndexOne(str));
    }

    public  static char getIndexOne(String str) {
        // write your code here
        char result = str.charAt(1);
        return result;
    }

}
