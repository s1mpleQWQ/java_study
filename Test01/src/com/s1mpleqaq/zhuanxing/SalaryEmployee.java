package com.s1mpleqaq.zhuanxing;

public class SalaryEmployee extends Employee {
    private double salary;
    private int workDay;
    private int offDay;

    public SalaryEmployee() {
    }

    public SalaryEmployee(String name,int year,int month,int day,double salary, int workDay, int offDay) {
        super(name,year,month,day);
        this.salary = salary;
        this.workDay = workDay;
        this.offDay = offDay;
    }

    public SalaryEmployee(String name, int year, int month, int day, int workDay, int offDay) {
        super(name,year,month,day);
        this.workDay = workDay;
        this.offDay = offDay;

    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public int getWorkDay() {

        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public int getOffDay() {
        return offDay;
    }

    public void setOffDay(int offDay) {
        this.offDay = offDay;
    }

    public double earning(){
        return salary-salary/workDay*offDay;
    }

    public String getInfo(){
        return super.getInfo()+" 月薪"+salary+" 工作天数"+workDay+" 请假天数"+offDay;
    }

}
