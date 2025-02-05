package com.core.java.week2.fileHandlingAssignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppend {
    public static void appendFile(String path) {

        try(BufferedWriter bw=new BufferedWriter(new FileWriter(path,true));
            Scanner sc=new Scanner(new File("Text.txt"))){
            while(sc.hasNextLine()){
                bw.write(sc.nextLine()+"\n");
            }

        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){

        appendFile("Append.txt");

    }
}
