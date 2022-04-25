package com.s1mpleqaq.interfacetest2;

public class Turtle implements Runner,Swimming{
    @Override
    public void run() {
        System.out.println("乌龟跑的慢");

    }

    @Override
    public void swim() {
        System.out.println("乌龟游的快");

    }
}
