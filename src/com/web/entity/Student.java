package com.web.entity;

public class Student extends Person{
    public String name = "student";
    public String studetNo = "123456";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void goToSchool(){
        System.out.println("student go to school");
    }

    public void eat (Student s) {
        System.out.println(this.getName() + s.getName());
    }

    public static void staticMethode(Student student){
        System.out.println(student.getName());
    }
}
