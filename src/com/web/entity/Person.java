package com.web.entity;

public class Person {
    public int age = 1;
    public String name = "person";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat () {
        System.out.println("person eat");
    }
}
