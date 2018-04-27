package com.interview.ExceptionDemo;

public class Test {
    public static void main(String[] args) throws Exception{
        try {
            try {
                throw new MyException();
            } catch (MyException e) {
                System.out.println("inner");
                throw e;
            }
        } catch (SonException e) {
            System.out.println("outside");
        } finally {
            System.out.println("finally area");
        }
    }
}
