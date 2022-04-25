package com.s1mpleqaq.interfacetest;

public class Animal implements LiveAble{
    @Override
    public void eat() {
        System.out.println("吃饭");

    }

    @Override
    public void breath() {
        System.out.println("吸入氧气，呼出二氧化碳");

    }

    @Override
    public void sleep() {
        System.out.println("闭上眼睛睡觉");
    }
}
