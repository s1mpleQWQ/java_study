package com.s1mpleqaq.interfacetest2;

public class Test {
    public static void main(String[] args) {
        Rabbit r = new Rabbit();
        Turtle t = new Turtle();
        r.run();
        t.swim();
        t.run();
        System.out.println("----------");
        Integer s = 20;
        System.out.println("s1 = " + s);
        changValue(s);
        System.out.println("s3 = " + s);

    }

    private static void changValue(Integer s) {
        s = 21;
        System.out.println("s2 = "+s);
    }
}
