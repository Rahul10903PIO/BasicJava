package com.core.java.week2.Day3;

abstract class Vehicle{
    public void runs(){
        System.out.println("Runs");
    }
    abstract void engineType();
}
class Cng extends Vehicle{
    void engineType(){
        System.out.println("Cng Engine");
    }

}

public class Abstract {
    public static void main(String[] args){
        Cng e=new Cng();
        e.engineType();
    }
}

