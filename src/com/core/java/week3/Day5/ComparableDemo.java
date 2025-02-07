package com.core.java.week3.Day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    int Date;
    String name;

    public Employee(int Date,String name){
        this.Date=Date;
        this.name=name;
    }
    @Override
    public int compareTo(Employee o) {
        if(this.Date>o.Date) return 1;
        else if(this.Date<o.Date) return -1;
        else return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Joining Date=" + Date +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ComparableDemo {
    public static void main(String[] args){
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(3,"Sarthak"));
        list.add(new Employee(2,"Tushar"));
        list.add(new Employee(1,"Rahul Sharma"));
        list.add(new Employee(1,"Arjun"));

        Collections.sort(list);
        System.out.println(list);
    }
}
