package com.s1mpleqaq.person;


public class Constructor {
    public static void main(String[] args) {
        Property s1= new Property();
        System.out.println(s1.getInfo());

        Property s3 = new Property(2022124,"李四",9999,'女');

        //Property s2= new Property(2022123,"张三",99999.9999,'男');
        System.out.println(s3.getInfo());

        s3.setSalary(120000);
        System.out.println(s3.getInfo());

        System.out.println("s1薪资：" + s1.getSalary());



    }
}
