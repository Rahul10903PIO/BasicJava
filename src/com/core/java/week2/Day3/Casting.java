package com.core.java.week2.Day3;

class A{

    public void display(){
        System.out.println("A display");
    }

}

class B extends A{

    public void display(){
        System.out.println("B display");
    }
    public void show(){
        System.out.println("B show");
    }

}

public class Casting {
    public static void main(String[] args){
        A a=new B();
        B b=(B) a;
        a.display();
        b.display();
    }
}
