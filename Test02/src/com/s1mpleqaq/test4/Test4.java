package com.s1mpleqaq.test4;

public class Test4 {
    public static void main(String[] args) {
        EmployeeService es = new EmployeeService();
        //（1）所有员工对象
        Employee[] employees = es.get(new Predicate() {
            @Override
            public boolean test(Object obj) {
                return true;
            }
        });
        for (int i = 0; i <employees.length ; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("===========================");
        //（2）所有年龄超过25的员工
        employees = es.get(new Predicate() {
            @Override
            public boolean test(Object obj) {
                Employee emp = (Employee) obj;
                return emp.getAge()>25;
            }
        });
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
