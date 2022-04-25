package com.s1mpleqaq.duotai;

public class Test007 {
    public static void main(String[] args) {
        Traffic[] arr = {new Car(),new Bicycle(),new Car(),new Bicycle()};
        for (Traffic tr: arr) {
            tr.drive();
        }

    }
}
