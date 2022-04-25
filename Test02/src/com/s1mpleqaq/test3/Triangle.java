package com.s1mpleqaq.test3;

public class Triangle {
    private  int id;
    private  int a;
    private  int b;
    private  int c;

    public Triangle() {
    }

    public Triangle(int id, int a, int b, int c) {
        this.id = id;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int zhouChang(){
        return a+b+c;
    }
    public double mianJi(){
        return (Math.sqrt((a+b+c)*(a+c-b)*(b+c-a)))/4;
    }
    public String toString(){
        return "编号："+id+" 周长："+zhouChang()+" 面积："+mianJi();
    }
}
