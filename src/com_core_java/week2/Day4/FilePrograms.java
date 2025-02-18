package com.core.java.week2.Day4;
import java.io.*;

public class FilePrograms {
    public static void main(String[] args) {

        try{

            FileReader fr=new FileReader("C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Text.txt");
            FileWriter fw=new FileWriter("C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Text1.txt");

            int character=0;
            while((character=fr.read())!=-1) {
                fw.write(character);
            }

            fr.close();
            fw.close();

            System.out.println("File Copied Successfully");
        } catch (IOException | ArithmeticException e) {
            System.out.println(e);
        }

    }
}
