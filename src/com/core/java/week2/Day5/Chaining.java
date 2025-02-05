package com.core.java.week2.Day5;

import java.io.IOException;

public class Chaining {
    public static void div(int a,int b) throws Throwable{
        try{
            int c=a/b;
        }catch(Exception e){
            throw e.initCause(new ArithmeticException("Java is unable to hold and read Infinite values"));
        }
    }
    public static void main(String[] args){
        try{
            div(10,0);
        }catch (Throwable t){
            System.out.println(t.getCause());
        }


    }
}
