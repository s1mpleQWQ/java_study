package com.s1mpleqaq.abstracttest;
/*
1、声明抽象父类：Person，包含抽象方法：
public abstract void walk();
public abstract void eat();

2、声明子类Man，继承Person
重写walk()：大步流星走路
重写eat()：狼吞虎咽吃饭
新增方法：public void smoke()实现为吞云吐雾

3、声明子类Woman，继承Person
重写walk()：婀娜多姿走路
重写eat()：细嚼慢咽吃饭
新增方法：public void buy()实现为买买买...
 */

public class Test {
    public static void main(String[] args) {
        Person s1 = new Man();
        Person s2 = new Woman();
        s1.eat();
        s1.walk();
        s2.eat();
        s2.walk();
        System.out.println("---------------");
        Man m = new Man();
        Woman w = new Woman();
        m.eat();
        m.walk();
        m.smoke();
        w.eat();
        w.walk();
        w.buy();



    }
}
