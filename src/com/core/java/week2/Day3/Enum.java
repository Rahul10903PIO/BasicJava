package com.core.java.week2.Day3;

enum Department{
    HR,Sales,It,Finance;
}

public class Enum {
    public static void main(String[] args){

        for (Department d:Department.values()){
            switch(d){
                case HR:
                    System.out.println(d.ordinal()+" Hires Employees");
                    break;
                case Sales:
                    System.out.println(d.ordinal()+" Sale Products");
                    break;
                case It:
                    System.out.println(d.ordinal()+" Performs It operations");
                    break;
                case Finance:
                    System.out.println(d.ordinal()+" Performs Financial operations");
                default:
                    System.out.println("Other Operations");
            }
        }
    }


}
