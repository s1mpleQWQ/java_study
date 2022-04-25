package com.s1mpleqaq.duotai;

public class Manager extends SalaryEmployee {
    private double commisionPer;

    public Manager() {
        super();
    }

    public Manager(String name,  double salary, int workingDays, double offDays, double commisionPer) {
        super(name, salary, workingDays, offDays);
        this.commisionPer = commisionPer;
    }

    public double getCommisionPer() {
        return commisionPer;
    }

    public void setCommisionPer(double commisionPer) {
        this.commisionPer = commisionPer;
    }

    @Override
    public double earning() {
        return super.earning() * (1+commisionPer);
    }
}