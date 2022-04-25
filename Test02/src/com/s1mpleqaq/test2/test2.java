package com.s1mpleqaq.test2;

public class test2 {
    public static void main(String[] args) {
        new Father(){

            @Override
            public void method() {
                System.out.println("Hello baby");
            }
        }.method();

    }
}
