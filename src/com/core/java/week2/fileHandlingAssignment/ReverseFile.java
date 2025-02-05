package com.core.java.week2.fileHandlingAssignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReverseFile {

    public static void main(String[] args){
        try(Scanner sc=new Scanner(new File("C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Text1.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Text3.txt"))){

            StringBuilder sb=new StringBuilder();

            while(sc.hasNextLine()){
               sb.append(sc.nextLine()+"\n");
            }

            sb.reverse();
            bw.write(sb.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
