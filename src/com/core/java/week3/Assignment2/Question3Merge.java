package com.core.java.week3.Assignment2;

import java.util.*;

public class Question3Merge {

    public  static <T> void merge(List<T> list1, List<T> list2){
        Set<T>  set=new TreeSet<>(list1);
        for(int i=0;i<list2.size();i++){
            if(!set.contains(list2.get(i))){
                set.add(list2.get(i));
            }
        }
        List<T> mergedList=new ArrayList<>(set);
        Iterator<T> itr=mergedList.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }

    public static void main(String[] args) {
        List<Integer> list1=Arrays.asList(1,2,3,4,5);
        List<Integer> list2=Arrays.asList(4,5,6,7,8);
        merge(list1,list2);
    }
}
