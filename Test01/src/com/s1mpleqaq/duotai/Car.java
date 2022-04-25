package com.s1mpleqaq.duotai;

class Car extends Traffic{
    @Override
    public void drive() {
        System.out.println("汽车：嘀嘀嘀");
    }
}

class Bicycle extends Traffic{

    @Override
    public void drive() {
        System.out.println("自行车：叮叮叮");
    }
}


