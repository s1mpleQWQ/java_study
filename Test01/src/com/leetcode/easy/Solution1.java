package com.leetcode.easy;


class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("数组下表分别为："+i+"和"+j);
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] nums = {-3,4,3,90};
        int target = 0;
        twoSum(nums,target);
    }
}