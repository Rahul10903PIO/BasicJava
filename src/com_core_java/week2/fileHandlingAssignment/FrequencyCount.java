package com.core.java.week2.fileHandlingAssignment;

import java.io.File;
import java.util.HashMap;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {

    public static void wordFrequency(String path){
        Map<String,Integer> map=new HashMap<>();

        try(Scanner sc=new Scanner(new File(path))){
            while(sc.hasNext()){
                String token=sc.next();
                System.out.println(token);
                if(map.containsKey(token)){
                    map.put(token,map.get(token)+1);
                }else{
                    map.put(token,1);
                }
            }
            for(Map.Entry<String,Integer> entry:map.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }

        }catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void main(String args[]){
            wordFrequency("C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Text.txt");
    }
}
