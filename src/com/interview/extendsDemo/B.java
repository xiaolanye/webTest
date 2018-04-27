package com.interview.extendsDemo;

public class B extends A{

    static {
        System.out.println("B static");
    }

    public B(){
        System.out.println("B");
    }
}
