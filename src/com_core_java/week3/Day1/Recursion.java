package com.core.java.week3.Day1;

public class Recursion {
    public static int fibonicci(int num){
//        Base Case
        if(num==1||num==0){
            return num;
        }
//        Recursive Case
        return fibonicci(num-1)+fibonicci(num-2);
    }
    public static int factorial(int num){
//        Base Case
        if(num==1){
            return num;
        }
//        Recursive Case
        return num*factorial(num-1);
    }
    public static void main(String args[]){
        System.out.println("Fibonicci Number = "+fibonicci(9));
        System.out.println("Factorial Number = "+factorial(5));
    }
}
