package com.web.test;

import com.web.entity.Person;
import com.web.entity.Student;

public class OverrideTest {
    public static void main(String[] args) {

    }
}
class X {
    public Person bark(){
        return null;
    }
}
class Y extends X{

    @Override
    public Student bark(){
        return null;
    }
}
