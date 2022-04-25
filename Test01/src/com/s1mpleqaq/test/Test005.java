package com.s1mpleqaq.test;

public class Test005 {
    public static void main(String[] args) {
        long sum = 0;
        long num;
        for(int i=1;i<=20;i++){
            num=1;
            for (int j=1;j<=i;j++){
                num*=j;
            }
            sum+=num;
        }
        System.out.println("1~20的阶乘是："+sum);
        System.out.println("2561327494111820313");

    }

}
