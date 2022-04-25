package com.s1mpleqaq.duotai;

public class Test008 {
    public static void main(String[] args) {
        Person p = new Person();
        goToToilet(new Woman());//隐含了Person p = new Woman();
        goToToilet(new Man());//隐含了Person p = new Man();

    }

    public static void goToToilet(Person p){
        p.toilet();
    }
}
