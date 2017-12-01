package com.web.test;

import com.web.entity.Person;
import com.web.entity.Student;

public class OverrideTest {
    public static void main(String[] args) {

    }
}
class X {
    public void bark(Person p){

    }
}
class Y extends X{

    @Override
    public void bark(Person s){

    }
}
