package com.s1mpleqaq.duotai;

public class Test009 {
    public static void main(String[] args) {
        Employee[] all = new Employee[3];

        all[0] = new HourEmployee("张三", 50, 50);
        all[1] = new SalaryEmployee("李四", 10000, 22, 1);
        all[2] = new Manager("老王", 20000, 22, 0, 0.3);

        double sum = 0;
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].getInfo());
            sum += all[i].earning();
        }
        System.out.println("总额：" + sum);
    }
}
