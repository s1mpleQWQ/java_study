package com.s1mpleqaq.zhuanxing;

public class Manager extends SalaryEmployee{
    private double proportion;

    public Manager() {
    }

    public Manager(String name,int year,int month,int day,double salary,int workDay,int offDay, double proportion) {
        super(name,year,month,day,salary,workDay,offDay);
        this.proportion = proportion;
    }
    public double earning(){
        return super.earning()*(1+proportion);
    }
    public String getInfo(){
        return  super.getInfo() + " 奖金比例：" +proportion;
    }
}
