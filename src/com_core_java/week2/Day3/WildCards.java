package com.core.java.week2.Day3;

import java.util.Arrays;
import java.util.List;

public class WildCards {
    public static void print(List<? extends Number> list){
        for(Object l:list) {
            System.out.println(l);
        }
    }
    public static void main(String args[]){
        List<Integer> l= Arrays.asList(1,2,3,4,5);
        print(l);
    }
}
