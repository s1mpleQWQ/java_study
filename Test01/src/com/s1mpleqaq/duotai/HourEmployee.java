package com.s1mpleqaq.duotai;

public class HourEmployee extends Employee {
    private double moneyPerHour;
    private double hours;

    public HourEmployee() {
        super();
    }

    public HourEmployee(String name, double moneyPerHour, double hours) {
        super(name);
        this.moneyPerHour = moneyPerHour;
        this.hours = hours;
    }

    public double getMoneyPerHour() {
        return moneyPerHour;
    }

    public void setMoneyPerHour(double moneyPerHour) {
        this.moneyPerHour = moneyPerHour;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    /*
     * 重写方法，public double earning()返回实发工资，
        实发工资 = 每小时多少钱 * 小时数
     */
    @Override
    public double earning() {
        return moneyPerHour * hours;
    }

}

