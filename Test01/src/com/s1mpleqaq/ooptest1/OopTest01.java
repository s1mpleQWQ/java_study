package com.s1mpleqaq.ooptest1;

public class OopTest01 {
    public static void main(String[] args){

        Bank s1 = new Bank();
        s1.account = 20220409;
        s1.balance = 9999.9999;
        Bank s2 = new Bank();
        s2.account = 20220410;
        s2.balance = 1111.1111;
        System.out.println("账户1：\n"+s1.account+"\n"+s1.balance+"\n"+s1.interest_rate);
        System.out.println("账户2：\n"+s2.account+"\n"+s2.balance+"\n"+s2.interest_rate);


    }
}

class Bank{


    long account;
    double balance;
    public static double interest_rate = 0.035;


}
