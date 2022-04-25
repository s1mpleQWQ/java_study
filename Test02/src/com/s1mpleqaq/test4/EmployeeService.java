package com.s1mpleqaq.test4;

import java.util.Arrays;

public class EmployeeService {

    private Employee[] arr;
    public EmployeeService(){
        arr = new Employee[5];
        arr[0] = new Employee(4, "李四", 24, 24000);
        arr[1] = new Employee(3, "张三", 23, 13000);
        arr[2] = new Employee(5, "王五", 25, 15000);
        arr[3] = new Employee(1, "赵六", 27, 17000);
        arr[4] = new Employee(2, "钱七", 16, 6000);
    }
    public Employee[] get(Predicate p){
        Employee[] result = new Employee[arr.length] ;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if(p.test(arr[i])){
                result[total++] = arr[i];
            }
        }
        return Arrays.copyOf(result, total);
    }
}
