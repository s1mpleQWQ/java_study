package com.s1mpleqaq.zhuanxing;

public abstract class Employee {
    private String name;
    private MyDate birthday;
    public Employee(String name, MyDate birthday) {
        super();
        this.name = name;
        this.birthday = birthday;
    }
    public Employee(String name, int year, int month, int day) {
        super();
        this.name = name;
        this.birthday = new MyDate(year, month, day);
    }
    public Employee() {
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public MyDate getBirthday() {
        return birthday;
    }
    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earning();

    public String getInfo(){
        return "姓名：" + name + "，生日：" + birthday.getInfo() +"，实发工资：" + earning();
    }
}

