package com.web.test;

import com.web.entity.Singleton;

public class TreadDemo02 extends Thread{

    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName());
        Singleton s = Singleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "：" +s);
    }

    public static void main(String[] args) {
        TreadDemo02 t1 = new TreadDemo02();
        TreadDemo02 t2 = new TreadDemo02();
        TreadDemo02 t3 = new TreadDemo02();
        TreadDemo02 t4 = new TreadDemo02();
        TreadDemo02 t5 = new TreadDemo02();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
