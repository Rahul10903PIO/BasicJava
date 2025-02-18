package com.core.java.week2.fileHandlingAssignment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args){
        String word="";
        try(Scanner sc=new Scanner(new File("C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Players.csv"))){

            while(sc.hasNext()){
                String token=sc.next();
                if(token.length()>word.length()){
                    word=token;
                }
            }
        }catch(IOException  e){
            System.out.println(e);
        }
        System.out.println("Longest Word In The File Is = "+word);
    }

}
