package com.core.java.week2.Day2;
class Student {

    static final String collegeName="JECRC University";
    String studentName;
    int rollNo;

    public void setStudent(String name,int rollNo){
        this.studentName=name;
        this.rollNo=rollNo;
    }
    void getStudent(){
        System.out.println("Name = "+this.studentName);
        System.out.println("Roll Number = "+this.rollNo);
        System.out.println("College Name = "+collegeName);
    }
    String getStudentName(){
        return this.studentName;
    }

}
public class Simple {
    public static void main(String[] args){
        Student st=new Student();
        st.setStudent("Rahul Sharma",235);
        st.getStudent();
    }

}
