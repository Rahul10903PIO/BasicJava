package com.core.java.week2.Day4;

import java.io.*;


public class FileHandling {
    public static void handlingFile(){
        try{
            BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Text5.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Text1.txt"));
            String line=null;

            while((line=bf.readLine())!=null) {
                bw.write(line+"\n");
            }
            bf.readLine();
            bf.close();
            bw.close();

            System.out.println("File Copied Successfully");
        } catch(IOException e) {
            e.addSuppressed(new Exception(e));
        }finally{
            throw new RuntimeException("Hi I am from Finally");
        }
    }
    public static void main(String[] args){
        try{
            handlingFile();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getSuppressed());
        }
    }
}
