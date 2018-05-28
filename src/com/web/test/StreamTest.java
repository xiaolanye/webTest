package com.web.test;

import com.web.entity.Student;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

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
        List<String> filterList = list.stream().filter(student -> student.getName().equals("abc")).map(Student::getName).collect(toList());
        System.out.println(filterList.size());
     }
}
