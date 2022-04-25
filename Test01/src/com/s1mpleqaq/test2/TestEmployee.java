package com.s1mpleqaq.test2;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(1,"蔡徐坤",9999);
        employees[1] = new Employee(2,"谢广坤",8999);
        employees[2] = new Employee(3,"刘能",7999);
        employees[3] = new Employee(4,"赵四",6999);
        employees[4] = new Employee(5,"宋小宝",8999);


        System.out.println("排序前：");
        //打印原顺序
        for (int i = 0; i <employees.length-1 ; i++) {
            employees[i].show();
        }
        //冒泡排序
        for (int i = 1; i <employees.length ; i++) {
            for (int j = 0; j <employees.length-1 ; j++) {
                if(employees[j].compareTo(employees[j+1])>0){
                    Employee emp;
                    emp = employees[j];
                    employees[j] = employees[j+1];
                    employees[j+1] = emp;
                }
            }
        }
        //打印冒泡排序后的顺序
        System.out.println("排序后：");
        for (int i = 0; i <employees.length ; i++) {
            employees[i].show();
        }
    }
}
