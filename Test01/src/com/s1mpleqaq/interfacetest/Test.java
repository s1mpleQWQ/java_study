package com.s1mpleqaq.interfacetest;

public class Test {
    public static void main(String[] args) {
        Animal x = new Animal();
        Plant y = new Plant();
        x.eat();
        x.breath();
        x.sleep();
        System.out.println("---------------------");
        y.eat();
        y.breath();
        System.out.println("---------------");
        LiveAble.drink();
    }
}
