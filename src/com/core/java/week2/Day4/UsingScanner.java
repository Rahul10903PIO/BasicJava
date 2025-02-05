package com.core.java.week2.Day4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) throws IOException {

            File f=new File("C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Players.csv");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String[] line=sc.nextLine().split(",");
                System.out.println(line[0]+" "+line[1]+" "+line[2]);
            }
            sc.close();
    }
}
