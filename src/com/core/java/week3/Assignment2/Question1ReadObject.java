package com.core.java.week3.Assignment2;



import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Question1ReadObject {
    public static void main(String[] args) {
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\RahulSharma\\IdeaProjects\\BasicJava\\Assignment2.txt"))){
            Pilgrim p=(Pilgrim)ois.readObject();
            p.getPilgrimInfo();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
