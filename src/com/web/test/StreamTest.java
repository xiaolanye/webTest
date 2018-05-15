package com.web.test;

import com.web.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("abc");
        s1.setAge(1);
        Student s2 = new Student();
        s2.setName("def");
        s2.setAge(2);
        Student s3 = new Student();
        s3.setName("ghi");
        s3.setAge(3);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        List<Student> filterList = list.stream().filter(student -> student.getName().equals("abc")).collect(Collectors.toList());
        System.out.println(filterList.size());
     }
}
