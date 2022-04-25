package com.s1mpleqaq.test;

public class Test003 {
    public static void main(String[] args) {
        int a;
        int n;
        num(1,10);
    }
    public static void num(int a,int n){
        int x = a;
        for (int i = 1; i <=n; i++) {
            x= (x+1)*2;
        }
        System.out.println(x);
    }

}
