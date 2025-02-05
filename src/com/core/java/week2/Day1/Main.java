package com.core.java.week2.Day1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//        Hello World

        System.out.println("Hello World");


// Primitive Datatype

//        Numeric Datatype
        byte var1=12;
        short var2=123;
        int var3=12345;
        long var4=123456;

//        character Datatype
        char chr ='R';

//        Boolean Datatype
        boolean flag=true;



//        Taking User Input


        Scanner sc=new Scanner(System.in);
        System.out.println("Integer Input");
        int int_input=sc.nextInt();

        System.out.println("Float Input");
        float flt_input=sc.nextFloat();

        System.out.println("Long Input");
        long lng_input=sc.nextLong();

        System.out.println("Double Input");
        double dbl_input=sc.nextDouble();

        System.out.println("Character Input");
        char ch=sc.next().charAt(0);

        sc.nextLine();
        System.out.println("String Input");
        String str=sc.nextLine();


//        Conditional Statements

//        if
        System.out.println("Enter Age");
        int age=sc.nextInt();

        if(age > 18){
            System.out.println("Can Vote");
        }

//        if - else
        if(age > 18){
            System.out.println("Can Vote");
        }else{
            System.out.println("Can't Vote");
        }
//nested if-else

        if(age>18){
            if(age>60){
                System.out.println("Senior Citizen");
            }else{
                System.out.println("Adult");
            }
        }else{
            System.out.println("Child");
        }

//        switch -case
        int num1=12;
        int num2=10;
        System.out.println("Enter Operator");
        char ch1=sc.next().charAt(0);
        switch (ch1){
            case '*':
                System.out.println(num1*num2);
                break;
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                System.out.println(num1/num2);
            default:
                System.out.println("Enter Valid Operation");
        }

//        Looping Structure

//        For loop
        int num=10;
        System.out.println("For Loop");
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }

//        commulative sum
        System.out.println("while Loop");
        int i=1;
        int sum=0;
        while(i<=4) {
            sum += i;
            i++;
        }
        System.out.println(sum);

//        do -while loop
        System.out.println("Do While Loop");
        int k=0;
        do{
            System.out.println(k);
            k++;
        }while(k<3);

// Arrays
        int[] arr =new int[3];

//        Taking Input in Array
        System.out.println("Integer Array Input");
        for(int j=0;j<3;j++){
            arr[j]=sc.nextInt();
        }

//        Printing Array
        for(int j=0;j<3;j++){
            System.out.println(arr[j]);
        }

//        Array  of Strings
        System.out.println("String Array Input");

        String[] strArr =new String[3];

        for(int j=0;j<3;j++){
            strArr[j]=sc.nextLine();
        }

        for(int j=0;j<3;j++){
            System.out.println(strArr[j]);
        }

//        toString method

        String str1= Arrays.toString(arr);

//        String Formatting

        String name="RahulSharma";

//        UpperCase
        System.out.println(name.toUpperCase());

//        LowerCase
        System.out.println(name.toLowerCase());

//        Length
        System.out.println(name.length());

        System.out.println(String.format(" hi %s",name));
//      StringBuilder

        StringBuilder sb=new StringBuilder("StringBuilder");
        System.out.println(sb);



//        StringBuffer
        StringBuffer sf=new StringBuffer("StringBuffer");
        System.out.println(sf);

    }

}
