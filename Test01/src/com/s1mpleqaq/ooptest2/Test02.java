package com.s1mpleqaq.ooptest2;

public class Test02 {

    public static void main(String[] args){

        Employee s1= new Employee();
        s1.name = "John";
        s1.birthday = new MyData();
        s1.birthday.day = 1;
        s1.birthday.month = 10;
        s1.birthday.year = 1949;
        Employee s2= new Employee();
        s2.name = "Jack";
        s2.birthday = new MyData();
        s2.birthday.day = 1;
        s2.birthday.month = 10;
        s2.birthday.year = 2022;


        System.out.println("成员1：\n"+"姓名："+s1.name+"\n生日："+s1.birthday.year+"年"+s1.birthday.month+"月"+s1.birthday.day+"日");
        System.out.println("成员2：\n"+"姓名："+s2.name+"\n生日："+s2.birthday.year+"年"+s2.birthday.month+"月"+s2.birthday.day+"日");
    }



}

class Employee{

    String name;
    MyData birthday;


}

class MyData{
    int year;
    int month;
    int day;
}