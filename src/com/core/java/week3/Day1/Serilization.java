package com.core.java.week3.Day1;

import java.io.*;

class Account implements Serializable{

    private String custName;
    private int balance;
    public Account(String custName,int balance){
        this.custName=custName;
        this.balance=balance;
    }
    public void getAccInfo(){
        System.out.println("Customer Name = "+custName);
        System.out.println("Balance Available = "+balance);
    }
}
public class Serilization {

    public static void main(String[] args)  {

        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("ser.ser"));
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ser.ser"))){

            Account a=new Account("Rahul",120);
            File f=new File("ser.ser");
            f.createNewFile();
            oos.writeObject(a);
            Account obs=(Account)ois.readObject();
            obs.getAccInfo();

        }catch(IOException | ClassNotFoundException e){

            System.out.println(e);

        }

    }
}
