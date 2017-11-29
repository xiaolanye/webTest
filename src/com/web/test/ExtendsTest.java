package com.web.test;

import com.web.entity.Person;
import com.web.entity.Student;

public class ExtendsTest {
    public static void main(String[] args) {
        Person p = new Student();
        Student s = new Student();
//        p.eat();
//        s.eat();
        doTest(s);
    }

    public static void doTest(Person p){
        System.out.println("p");
    }

    public static void doTest(Student s){
        System.out.println("s");
    }
}
