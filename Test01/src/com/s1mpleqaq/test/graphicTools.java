package com.s1mpleqaq.test;

public class graphicTools {
    public static void main(String[] args) {
        int bottom_edge,high;
        int a,b,c;
        method1(3,4);
        method2(3,4,5);

    }
    public static void method1(int bottom_edge,int high){
        double area = (bottom_edge * high)/2;
        System.out.println("一直底边长和高求面积为： " + area);

    }

    public static void method2(int a, int b, int c) {
        double area = Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a))/4;
        System.out.println("已知三边长求面积为： " + area);
    }
}

