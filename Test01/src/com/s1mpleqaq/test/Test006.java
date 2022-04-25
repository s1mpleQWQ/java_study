package com.s1mpleqaq.test;

public class Test006 {
    public static void main(String[] args) {
        //double radius = 0;
        Circle[] arr = new Circle[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = new Circle();//有对象才有半径
            arr[i].radius = Math.random()*9+1;
        }
        for(int i=0; i<arr.length; i++){
            //arr[i]是一个Circle的对象，就可以调用Circle类中的属性和方法
            System.out.println(arr[i].getInfo());
        }
    }
}
class Circle{
    double radius;

    public  double getArea(){
        return Math.PI* radius * radius;
    }
    public  double getPerimeter(){
        return Math.PI*radius*2;
    }
    public  String getInfo(){
        return "半径：" + radius +"，面积：" + getArea() + "，周长：" + getPerimeter();
    }
}
