package com.s1mpleqaq.test;

public class Fuxi{
    public static void main(String[] args) {
        new Xi();

    }
}

class Xi {

    int num = getNum();

    {
        System.out.println("1");
    }



    private int getNum() {
        System.out.println("2");
        return 0;
    }
    public Xi(){
        System.out.println("3");
    }
}
