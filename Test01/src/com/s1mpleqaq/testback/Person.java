package com.s1mpleqaq.testback;
public class Person{
    public static void main(String[] args) {
        String name = "李白";
        int age = 20;
       Outer p = new Outer();
       p.outTest();
        System.out.println("==========");
       Outer.outMethod();


    }
}

class Outer {
    private static int a = 1;
    private int b = 2;

    public static void outMethod() {
        final int c = 3;
        class Inner {
            public void inMethod() {
                System.out.println("out.a = " + a);//1
                // System.out.println("out.b = " + b);//错误的，因为outMethod是静态的
                System.out.println("out.local.c = " + c);//3
            }
        }

        Inner in = new Inner();
        in.inMethod();
    }

    public void outTest() {
        final int c = 3;
        class Inner {
            public void inMethod() {
                System.out.println("out.a = " + a);// 1
                System.out.println("out.b = " + b);// 2 可以，因为outTest是非静态的
                System.out.println("method.c = " + c);//3
            }
        }

        Inner in = new Inner();
        in.inMethod();
    }

}
