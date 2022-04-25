package com.s1mpleqaq.ooptest3;

public class Max01 {
    public static void main(String[] args) {
        System.out.println(maxYue(2,3));
        System.out.println(maxYue(4,8,24));
    }

    public static int maxYue(int... args) {
        //找很多个数的公约数
        //(1)找出它们中最小的
        //类似于在数组中找最小值
        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }

        //(2)从小的数往1的方向找，找到的第一个公约数就是它们的最大公约数
        for (int i = min; i >= 1; i--) {
            //这个i得把args中所有的数都整除了，那么i就是他们的公约数
            boolean flag = true;//假设i可以把args中所有数都整除了
            for (int j = 0; j < args.length; j++) {
                if (args[j] % i != 0) {//args中有一个数不能被i整除，说明这个i不是它们的公约数
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;//return会结束当前方法
            }
        }

        return 1;//1是所有数的公约数
		/*
		假设args中6和9  args[0]是6，args[1]是9，min=6
		外循环第一次i=min=6,
				内循环第一次：j=0,  if(args[0] % 6！=0)不成立 j++
				内循环第二次：j=1,  if(args[1] % 6!=0)成立   flag = false  ;break;
				说明i不是它们公约数
		外循环第二次i=5
				内循环第一次：j=0,  if(args[0] % 5 !=0)成立 j++  flag = false;break;
				说明i不是它们公约数
		外循环第三次i=4
				内循环第一次：j=0,  if(args[0] % 4 !=0)成立 j++  flag = false;break;
				说明i不是它们公约数
		外循环第四次i=3
				内循环第一次：j=0,  if(args[0] % 3 !=0)不成立 j++
				内循环第二次：j=1,  if(args[1] % 3 !=0)不成立 j++
				if(flag)成立，return i;
		*/
    }

}
