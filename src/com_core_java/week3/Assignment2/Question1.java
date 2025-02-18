package com.core.java.week3.Assignment2;

import java.io.*;

class Pilgrim implements Serializable{
    private static final long serialVersionUID =12332;
    private int age;
    private String name;
    private String city;
    private String mobileNo;
    public Pilgrim(String mobileNo, String city, String name, int age) {
        this.mobileNo = mobileNo;
        this.city = city;
        this.name = name;
        this.age = age;
    }

    public void getPilgrimInfo(){
        System.out.println(String.format("Pilgrim Name : %s\nCity : %s\nAge : %d\nMobile Number : %s",this.name,this.city,this.age,this.mobileNo));
    }
}
public class Question1 {
    public static void main(String[] args) {
        Pilgrim p=new Pilgrim("+91 8708714686","Rewari","Rahul Sharma",21);

        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Assignment2.txt"));
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Assignment2.txt"))){
            oos.writeObject(p);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
