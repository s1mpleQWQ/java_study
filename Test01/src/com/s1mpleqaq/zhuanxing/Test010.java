package com.s1mpleqaq.zhuanxing;

import java.util.Scanner;

class Test010 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new HourEmployee("张三", 1990, 5, 1, 50, 50);
        employees[1] = new SalaryEmployee("李四", 1991, 1, 1, 10000, 22, 1);
        employees[2] = new Manager("老王", 1987, 12, 8, 20000, 22, 0, 0.3);
        Scanner input = new Scanner(System.in);
        System.out.print("请输入当前月份：");
        int month;
        while(true){
            month = input.nextInt();
            if(month>=1 && month<=12){
                break;
            }
        }
        input.close();

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getInfo());
            if(employees[i] instanceof SalaryEmployee){
                if(month == employees[i].getBirthday().getMonth()){
                    System.out.println(employees[i].getName() +" 生日快乐，领取生日补助购物卡");
                }
            }else{
                HourEmployee he = (HourEmployee) employees[i];
                he.leave();
            }
        }
    }

}
