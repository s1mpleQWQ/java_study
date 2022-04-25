package com.s1mpleqaq.ooptest3;

public class ChangeArgs {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 62, 431, 2 };
        int sum1 = getSum1(arr);
        System.out.println("sum1 = " + sum1);

        int sum2 = getSum2(arr);
        System.out.println("sum2 = " + sum2);
        int sum3 = getSum2(1, 4, 62, 431, 2);
        System.out.println("sum3 = " + sum3);
    }

    // 完成数组 所有元素的求和
    // 原始写法
    public static int getSum1(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    // 可变参数写法
    public static int getSum2(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
