package com.web.test;

/**
 * 线程测试类01
 * @author 许海龙
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        Person2 p2 = new Person2();
        p1.setDaemon(true);
        p1.start();
        p2.start();
        System.out.println("main over");
    }
}
class Person1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你是谁呀??????????????");
            Thread.yield();
        }
        System.out.println("你是谁呀over");
    }
}

class Person2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("修水管的");
            Thread.yield();
        }
        System.out.println("修水管的over");
    }
}
