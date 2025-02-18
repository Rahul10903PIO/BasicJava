package com.core.java.week3.Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    public int rollNo;
    public String name;
    public Student(int rollNo,String name) {
        this.name=name;
        this.rollNo=rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {

        List<Student> list=new ArrayList<>();

        list.add(new Student(12,"Rahul"));
        list.add(new Student(1,"Ritesh"));
        list.add(new Student(3,"Mohit"));
        list.add(new Student(4,"Tushar"));
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.rollNo-o2.rollNo;
            }
        });

        System.out.println(list);
    }
}
