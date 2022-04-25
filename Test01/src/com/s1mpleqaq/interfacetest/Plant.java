package com.s1mpleqaq.interfacetest;

public class Plant implements LiveAble{
    @Override
    public void eat() {
        System.out.println("吸收养分");

    }

    @Override
    public void breath() {
        System.out.println("吸入二氧化碳，呼出氧气");

    }

}
