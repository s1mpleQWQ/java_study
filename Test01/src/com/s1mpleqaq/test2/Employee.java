package com.s1mpleqaq.test2;

public class Employee implements Comparable{
    private int account ;
    public String name ;
    private double salary;

    public Employee() {
    }

    public Employee(int account, String name, double salary) {
        this.account = account;
        this.name = name;
        this.salary = salary;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int  account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void show(){
        System.out.println("编号：" + account+" 姓名："+name+" 薪资："+salary);
    }
    public int compareTo(Object o) {
        Employee emp = (Employee) o;
        if(this.getSalary() != emp.getSalary()){
            return Double.compare(this.getSalary(), emp.getSalary());
        }
        return this.account - emp.account;
    }
}
