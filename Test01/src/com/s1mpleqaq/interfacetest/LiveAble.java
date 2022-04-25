package com.s1mpleqaq.interfacetest;

public interface LiveAble {
    public abstract void eat() ;
    public abstract void breath();

    public default void sleep(){
        System.out.println("睡觉");
    }
    public static void drink(){
        System.out.println("喝水");
    }
}
