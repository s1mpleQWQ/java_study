package com.s1mpleqaq.lianxi01;

import sun.awt.HeadlessToolkit;

public class Test {
    public static void main(String[] args) {
        // 创建外部类对象
        Body body = new Body();
        //  创建内部类对象
        Body.Heart heart = body.new Heart();
        // 调用内部类方法
        heart.beat();
        System.out.println("-----------");
        // 调用外部类方法
        body.setLive(false);
        // 调用内部类方法
        heart.beat();

    }
}
