package com.core.java.week3.Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    public int rollNo;
    public String name;
    public Student(int rollNo,String name){
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
    public static void main(String[] args){
        char a='a';
        int rollNo=1;
        List<Student> list=new ArrayList<>();

        for(int i=0;i<4;i++){
            list.add(new Student(rollNo,""+a));
            a++;
            rollNo++;
        }
        Collections.sort(list,new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                return s2.rollNo-s1.rollNo;

            }
        });
        System.out.println(list);
    }
}
