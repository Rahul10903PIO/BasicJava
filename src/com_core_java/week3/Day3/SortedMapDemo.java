package com.core.java.week3.Day3;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
class Year implements Comparable{
    int year;
    public Year(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Object o) {
        Year y=(Year)o;
        return this.year-y.year;
    }

    @Override
    public String toString() {
        return "Year{" +
                "year=" + year +
                '}';
    }
}
class Book{

    String name;
    public Book(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class SortedMapDemo {
    public static void main(String args[]){
        Map<Year,Book> fl=new TreeMap<>();
        String[] bookName={"Phyics","Chemistry","Maths"};
        int[] year={2001,2003,2001};
        for(int i=0;i<3;i++){
            fl.put(new Year(year[i]),new Book(bookName[i]));
        }
        for(Map.Entry<Year,Book> book:fl.entrySet()){
            System.out.println(book);
        }
    }
}
