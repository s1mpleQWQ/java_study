package com.s1mpleqaq.thread;

public class TestThread {
    public static void main(String[] args) {
        Bar bar = new Bar();
        Cook c = new Cook(bar);
        Waiter w = new Waiter(bar);
        c.setName("家常菜大厨");
        w.setName("翠花");
        c.start();
        w.start();
    }

}

// 柜台存放菜
class Bar extends Thread{
    public static final int MAX_NUM = 10;
    private Bar bar;
    int count;

}
// 厨师做菜
class Cook extends Thread{
    private Bar bar;

    public Cook(Bar bar) {
        this.bar = bar;
    }

    public void run(){
        while (true) {
            synchronized (bar) {
                // 厨师做菜之前进行校验
                if (bar.count >= Bar.MAX_NUM){
                    try {
                        bar.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                bar.count++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(this.getName() + "做了一道菜，现在还有" + bar.count + "份菜");
                bar.notify();
            }
        }
    }
}

// 服务员端菜
class Waiter extends Thread{
    private Bar bar;

    public Waiter(Bar bar) {
        this.bar = bar;
    }

    public void run(){
        while(true) {

            synchronized (bar) {
                // 服务员端菜之前进行校验
                if (bar.count <= 0){
                    try {
                        bar.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                bar.count--;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + "端走了一道菜，现在还有" + bar.count + "份菜");
                bar.notify();
            }
        }
    }
}