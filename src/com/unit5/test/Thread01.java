package com.unit5.test;

public class Thread01 implements Runnable{
    static int count = 0;

    @Override
    public void run() {
        for(int i = 0 ; i < 1000; i++){
            System.out.println(count++);
        }
    }

    public static void main(String[] args) {
        Thread01 test01 = new Thread01();
        Thread01 test02 = new Thread01();
        Thread thread1 = new Thread(test01);
        Thread thread2 = new Thread(test02);
        thread1.start();
        thread2.start();
        Thread.yield();
    }
}
