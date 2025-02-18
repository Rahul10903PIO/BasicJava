package com.core.java.week3.Assignment2;

import java.math.BigInteger;

public class Question2 {
    public BigInteger factorial(long num) throws IllegalArgumentException{
        if(num <= 0){
            throw new IllegalArgumentException("Entered Negative Number Or Zero");
        }
        if(num==1){
            BigInteger big= BigInteger.ONE;
            return big;
        }
        return BigInteger.valueOf(num).multiply(factorial(num-1));
    }
    public static void main(String[] args) {
        Question2 q=new Question2();
        try{
                System.out.println(q.factorial(200));
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
