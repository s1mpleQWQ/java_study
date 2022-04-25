package com.s1mpleqaq.ooptest3;

public class ChangeArgs_Exer4 {
    public static void main(String[] args) {
        System.out.println(concat('+'));
        System.out.println(concat('+',"hello","world","你好"));
    }
    public static String concat(char seperator, String... args){
        String str = "";
        for (int i = 0; i < args.length; i++) {
            if(i==0){
                str += args[i];
            }else{
                str += seperator + args[i];
            }
        }
        return str;
    }
}