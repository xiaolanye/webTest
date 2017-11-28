package com.web.entity;

public class Student extends Person{
    public int age = 2;
    public String name = "student";
    public String studetNo = "123456";

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

    public void goToSchool(){
        System.out.println("student go to school");
    }

    public void eat () {
        System.out.println("Student eat");
    }
}
