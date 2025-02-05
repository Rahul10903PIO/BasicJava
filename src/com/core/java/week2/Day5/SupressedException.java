package com.core.java.week2.Day5;

import java.io.IOException;

class Validate implements AutoCloseable{

    @Override
    public void close() throws Exception {
        throw new IOException("File Not Closed Properly");
    }
    public void div(int num1,int num2){
        int c=num1/num2;
    }
}
public class SupressedException {
    public static void main(String[] args){
        try(Validate v=new Validate()){
            v.div(10,0);
        }catch(Exception e){
            System.out.println(e);
            for(Throwable ele:e.getSuppressed()){
                System.out.println(ele);
            }
        }
    }
}
