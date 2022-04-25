package com.s1mpleqaq.test;

public class DiGui {
    public static void main(String[] args) {
        long sum=0;
        for (int i = 1; i <=20 ; i++) {
            sum =sum+DiGui(i);
        }
        System.out.println("2561327494111820313");
        System.out.println("1-20阶乘之和是： " + sum);
    }
    public static long DiGui(int a){
        if(a == 1){
            return 1;
        }else{
            return a*DiGui(a-1);
        }
    }
}
