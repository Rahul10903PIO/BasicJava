package com.core.java.week3.Day5;

import java.util.LinkedList;
import java.util.Queue;

class Counter{
    private static Queue<StudentFees> feesQueue=new LinkedList<>();

    public void payFees(StudentFees s){
        feesQueue.add(s);
    }
    public void feesPaid(){
        StudentFees stu=feesQueue.remove();
        System.out.println(stu.getStuName()+" Paid the amount of "+ stu.getFees());
    }
    public int getPendingQueue(){
        return feesQueue.size();
    }
}
class StudentFees{

    private String stuName;
    private long fees;
    private int rollNo;
    public StudentFees(int rollNo,String stuName,long fees) {
        this.rollNo=rollNo;
        this.stuName=stuName;
        this.fees=fees;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public long getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees= fees;
    }

}

public class FeesCounter {
    public static void main(String[] args) {
        Counter c=new Counter();
        c.payFees(new StudentFees(21,"Ritesh",21000));
        c.payFees(new StudentFees(23,"Tushar",24000));
        c.payFees(new StudentFees(1,"Nancy",20000));
        int size=c.getPendingQueue();

        for(int i=0;i<size;i++){
            c.feesPaid();
        }

    }
}
