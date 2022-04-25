package com.s1mpleqaq.ooptest3;

public class Su4 {
    public static void main(String[] args) {
        // 声明一个方法，可以找出任意个整数的最大公约数
        //int maxYueShu = getMaxYueShu(10, 20, 15, 20);
        //System.out.println("maxYueShu = " + maxYueShu);
        System.out.println(sameChars("hello", "world"));//ol
        System.out.println(sameChars("chai", "wolrd"));
        System.out.println(sameChars("atguigu", "java"));
        System.out.println(sameChars("samewordsg", "string", "words"));
    }

    public static String sameChars(String... words) {
        String same = "";
        for (char a = 'A'; a <= 'z'; a++) {
            //统计相同单词的个数
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                for (int h = 0; h < words[j].length(); h++) {
                    if (words[j].charAt(h) == a) {
                        count++;
                        break;
                    }
                }
            }
            //当相同的个数等于字符个数时 判定所有的字符串都出现过
            if (count == words.length) {
                same += a;
            }
        }
        return same;
    }
}
