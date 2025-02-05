package com.core.java.week2.Day3;

class Student{

    private String name;
    private int rollNo;


    public void setInfo(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    public void getInfo(){
        System.out.println("Name = "+this.name);
        System.out.println("Roll number ="+this.rollNo);
    }


}


public class Encapsulation {
    public static void main(String[] args){
        Student s=new Student();
        s.setInfo("Rahul Sharma",235);
        s.getInfo();
    }

}
