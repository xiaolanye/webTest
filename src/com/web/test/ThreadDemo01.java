package com.web.test;

/**
 * 线程测试类01
 * @author 许海龙
 */
public class ThreadDemo01 {

    public static final ThreadDemo01 demo01 = new ThreadDemo01();

    public static void main(String[] args) {
        Person1 p1 = new Person1();
        Person2 p2 = new Person2();
        p1.setDaemon(true);
        p1.start();
        p2.start();
        System.out.println("main over");
    }

    public void binfa(String str){
        while (true) {
            System.out.println("--------------");
            System.out.println(str);
            System.out.println("--------------");
        }
    }

}
class Person1 extends Thread {
    @Override
    public void run() {
//        for (int i = 0; i < 1000000000; i++) {
//            System.out.println("你是谁呀??????????????");
//            //Thread.yield();
//        }
//        System.out.println("你是谁呀over");
        ThreadDemo01.demo01.binfa("线程1");
    }
}

class Person2 extends Thread {
    @Override
    public void run() {
//        for (int i = 0; i < 100000000; i++) {
//            System.out.println("修水管的");
//            //Thread.yield();
//        }
//        System.out.println("修水管的over");
        ThreadDemo01.demo01.binfa("线程2");
    }
}
