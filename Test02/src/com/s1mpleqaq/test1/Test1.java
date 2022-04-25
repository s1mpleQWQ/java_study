package com.s1mpleqaq.test1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(2010,"刘能",15000);
        employees[1] = new Employee(2011,"赵四",16000);
        employees[2] = new Employee(2012,"谢广坤",17000);
        employees[3] = new Employee(2018,"宋小宝",14000);
        employees[4] = new Employee(2017,"小沈阳",13000);
        // 打印原数组顺序
        System.out.println("排序前：");
        for (int i = 0; i <=employees.length-1 ; i++) {
            System.out.println(employees[i].toString());
        }
        // 按薪资高低进行排序
        Arrays.sort(employees, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });
        System.out.println("按薪资排序：");
        for (int i = 0; i <=employees.length-1 ; i++) {
            System.out.println(employees[i].toString());
        }
        Arrays.sort(employees, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;
                return Double.compare(e1.getId(), e2.getId());
            }
        });

        System.out.println("按编号排序：");
        for (int i = 0; i <=employees.length-1 ; i++) {
            System.out.println(employees[i].toString());
        }


    }
}
