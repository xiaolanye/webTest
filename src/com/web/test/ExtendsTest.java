package com.web.test;

import com.web.entity.Person;
import com.web.entity.Student;

public class ExtendsTest {
    public static void main(String[] args) {
        Person p = new Student();
        p.eat();
    }
}
