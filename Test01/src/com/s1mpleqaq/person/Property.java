package com.s1mpleqaq.person;

public class Property {
    private long account;
    private String name;
    private double salary;
    private char sex;

    public Property(long account, String name,  double salary, char sex){
        this.account=account;
        this.name = name;
        this.salary=salary;
        this.sex = sex;
    }

    public Property() {

    }

    public long getAccount(){
        return account;
    }
    public void setAccount(long account){
        this.account=account;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public char getSex(){
        return sex;
    }
    public void setSex(char sex){
        this.sex=sex;
    }

    public String getInfo(){
        return "编号：" + account + "，姓名：" + name + "，薪资：" + salary + "，性别：" +sex;

    }



}
