package com.core.java.week3.Day1;

import java.io.*;
class ArrSerialization implements Serializable{
    Integer[] arr={1,2,3,4,5};
   public void print(){
       for(int i : arr){
           System.out.println(i);
       }
   }
}
public class SerializingArray {

    public static void main(String args[])  {
        int[]  arr1={1,2,3,4,5};
        ArrSerialization a=new ArrSerialization();
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("HasA.txt"));
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("HasA.txt"))){
            oos.writeObject(a);

            ArrSerialization b=(ArrSerialization)ois.readObject();
            b.print();

        } catch (IOException | NullPointerException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

}
