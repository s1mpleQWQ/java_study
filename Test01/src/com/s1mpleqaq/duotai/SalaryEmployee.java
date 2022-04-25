package com.s1mpleqaq.duotai;

public class SalaryEmployee extends Employee {
    private double salary;
    private int workingDays;//工作日天数，
    private double offDays;//请假天数

    public SalaryEmployee() {
        super();
    }

    public SalaryEmployee(String name,  double salary, int workingDays, double offDays) {
        super(name);
        this.salary = salary;
        this.workingDays = workingDays;
        this.offDays = offDays;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public double getOffDays() {
        return offDays;
    }

    public void setOffDays(double offDays) {
        this.offDays = offDays;
    }

    /*
     * 重写方法，public double earning()返回实发工资，
        实发工资 = 薪资 - 薪资/工作日天数 * 请假天数
     */
    @Override
    public double earning() {
        return salary - salary/workingDays * offDays;
    }

}