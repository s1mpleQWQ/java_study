package com.s1mpleqaq.zhuanxing;

public class HourEmployee extends Employee {
    private int workTime;
    private int timeMoney;

    public HourEmployee() {
    }

    public HourEmployee(String name,int year,int month,int day,int workTime, int timeMoney) {
        super(name,year,month,day);
        this.workTime = workTime;
        this.timeMoney = timeMoney;
    }
    public double earning(){
        return timeMoney*workTime;
    }
    public String getInfo(){
        return super.getInfo()+" 时薪:"+timeMoney+" 工作小时数:"+workTime;
    }
    public void leave(){
        System.out.println("小时工，查看使用工具是否损坏，需要赔偿，然后拿钱走人 ");
    }
}
