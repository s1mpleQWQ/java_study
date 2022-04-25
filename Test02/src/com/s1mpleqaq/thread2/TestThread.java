package com.s1mpleqaq.thread2;

public class TestThread {
    public static void main(String[] args) {
        WindowBoard windowBoard = new WindowBoard();
        Cook c1 = new Cook(windowBoard);
        Cook c2 = new Cook(windowBoard);
        Waiter w1 = new Waiter(windowBoard);
        Waiter w2 = new Waiter(windowBoard);
        Thread t1 = new Thread(w1,"小红");
        Thread t2 = new Thread(c1,"川菜师傅");
        Thread t3 = new Thread(w2,"翠花");
        Thread t4 = new Thread(c2,"粤菜师傅");

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}

class WindowBoard{
    public static final int MAX_NUM = 10;
    private WindowBoard windowBoard;
    private int count;
    // 厨师做菜
    public synchronized void put(){
        while(true) {
            while(count >= MAX_NUM){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            System.out.println(Thread.currentThread().getName() + "制作了一份快餐，现在工作台上有：" + count + "份快餐");
            this.notifyAll();
        }
    }
    // 服务员上菜
    public synchronized void take(){
        while(true) {
            while(count <= 0){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count--;
            System.out.println(Thread.currentThread().getName() + "取走了一份快餐，现在工作台上有：" + count + "份快餐");
            this.notifyAll();
        }

    }
}

class Cook implements Runnable{
    private WindowBoard windowBoard;

    public Cook(WindowBoard windowBoard) {
        this.windowBoard = windowBoard;
    }

    @Override
    public void run() {
        while (true) {
            windowBoard.put();
        }
    }

}

class Waiter implements Runnable{
    private WindowBoard windowBoard;

    public Waiter(WindowBoard windowBoard) {
        this.windowBoard = windowBoard;
    }

    @Override
    public void run() {
        while(true) {
            windowBoard.take();
        }
    }
}