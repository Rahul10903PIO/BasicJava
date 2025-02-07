package com.core.java.week3.Day4;


import java.io.*;
import java.util.*;

class Pilgrim implements Comparable, Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pilgrim pilgrim = (Pilgrim) o;
        return age == pilgrim.age && Objects.equals(name, pilgrim.name) && Objects.equals(city, pilgrim.city) && Objects.equals(mobileNo, pilgrim.mobileNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, city, mobileNo);
    }

    @Override
    public int compareTo(Object o) {
        return ((Pilgrim)o).age-this.age;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
public class HashSetDemo {
    public static void main(String[] args){

        Set<Pilgrim> set=new TreeSet<>();

        set.add(new Pilgrim("+91 8708714686","Rewari","Rahul Sharma",21));
        set.add(new Pilgrim("+91 8708714686","Rewari","Rahul",25));
        set.add(new Pilgrim("+91 8708714686","Rewari","Sharma",22));
        set.add(new Pilgrim("+91 8708714686","Rewari","Rahul Sharma",23));

        System.out.println(set.size());

        for(Pilgrim s:set){
            System.out.println(s);
        }

        Pilgrim p=new Pilgrim("+91 8708714686","Rewari","Rahul Sharma",21);

        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Assignment2.txt"));
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Assignment2.txt"))){
            oos.writeObject(p);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
