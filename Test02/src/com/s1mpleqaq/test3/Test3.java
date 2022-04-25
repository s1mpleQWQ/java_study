package com.s1mpleqaq.test3;



import com.s1mpleqaq.test1.Employee;

import java.util.Arrays;
import java.util.Comparator;

public class Test3 {
    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[4];
        triangles[0] = new Triangle(2010,1,3,3);
        triangles[1] = new Triangle(2018,1,2,3);
        triangles[2] = new Triangle(2015,3,2,3);
        triangles[3] = new Triangle(2022,4,2,3);
        // 按周长排序
        Arrays.sort(triangles, new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Triangle t1 = (Triangle) o1;
                Triangle t2 = (Triangle) o2;

                return Double.compare(t1.zhouChang(), t2.zhouChang());
            }
        });
        //输出
        System.out.println("周长排序：");
        for (int i = 0; i <triangles.length ; i++) {
            System.out.println(triangles[i].toString());
        }
        // 按面积排序
        Arrays.sort(triangles, new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Triangle t1 = (Triangle) o1;
                Triangle t2 = (Triangle) o2;

                return Double.compare(t1.mianJi(), t2.mianJi());
            }
        });

        //输出
        System.out.println("面积排序：");
        for (int i = 0; i <triangles.length ; i++) {
            System.out.println(triangles[i].toString());
        }
    }
}
