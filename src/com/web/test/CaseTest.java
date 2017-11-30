package com.web.test;

public class CaseTest {
    public static void main(String[] args) {
        switch (new Integer(45)) {
            case 40:
                System.out.println("40");
                break;
            case 45:
                System.out.println("45");//将会打印这句
                break;
            default:
                System.out.println("?");
                break;
        }
    }
}
