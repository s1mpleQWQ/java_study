package com.s1mpleqaq.test;


public class Test001 {
    public static void main(String[] args) {

        int[] a = {6, 5, 4, 3, 2, 1};
        short[] c = {11,22,33,10,9};
        byte[] b = {1,3,4,7,9,2};
        long[] d = {999,23123,54545,65656,31232};
        double[] e = {1.11,2.22,0.22,5.23,3.22};
        char[] f = {'a','b','A','B','d','D'};
        sort(a);
        sort(b);
        sort(c);
        sort(d);
        sort(e);
        sort(f);

    }

    public static void sort(int... a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                int temp;
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
        for (int i : a) {
            System.out.print(i+",");
        }
        System.out.println();
    }

    public static void sort(byte... b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length - 1; j++) {
                byte temp;
                if (b[j] > b[j + 1]) {
                    temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }

        }
        for (byte e : b) {
            System.out.print(e+",");
        }
        System.out.println();
    }

    public static void sort(short... c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length - 1; j++) {
                short temp;
                if (c[j] > c[j + 1]) {
                    temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }

        }
        for (short s : c) {
            System.out.print(s+",");
        }
        System.out.println();
    }

    public static void sort(long... d) {
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length - 1; j++) {
                long temp;
                if (d[j] > d[j + 1]) {
                    temp = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = temp;
                }
            }

        }
        for (long l : d) {
            System.out.print(l+",");
        }
        System.out.println();
    }

    public static void sort(double... e) {
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e.length - 1; j++) {
                double temp;
                if (e[j] > e[j + 1]) {
                    temp = e[j];
                    e[j] = e[j + 1];
                    e[j + 1] = temp;
                }
            }

        }
        for (double d : e) {
            System.out.print(d+",");
        }
        System.out.println();
    }

    public static void sort(char... f) {
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f.length - 1; j++) {
                char temp;
                if (f[j] > f[j + 1]) {
                    temp = f[j];
                    f[j] = f[j + 1];
                    f[j + 1] = temp;
                }
            }

        }
        for (char e : f) {
            System.out.print(e+",");
        }
        System.out.println();
    }


}


