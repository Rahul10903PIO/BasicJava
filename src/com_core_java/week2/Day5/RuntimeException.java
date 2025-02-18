package com.core.java.week2.Day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeException {
    public static int div(int num1,int num2){
        return num1/num2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the first Number : ");
            int num1=sc.nextInt();
            System.out.println("Enter The Second Number : ");
            int num2=sc.nextInt();
            System.out.println("Division = "+num1/num2);
        }catch(ArithmeticException  e){

            System.out.println(e+" : Division by Zero");

        }catch(InputMismatchException e){

            System.out.println(e+" : Enter correct Input type ");

        }catch(Exception e){

            System.out.println(e);

        }
    }
}
