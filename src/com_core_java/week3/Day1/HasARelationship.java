package com.core.java.week3.Day1;

import java.io.*;

class Contact{

    private String phoneNumber;
    private String email;

    public Contact(String email,String phoneNumber){
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public void getContactInfo(){
        System.out.println("Email = "+this.email);
        System.out.println("Phone Number = "+this.phoneNumber);
    }

}
class Customer implements Serializable {

    private String name;
    private int balance;
    transient Contact cont;
    static final String bankName="Canara Bank";

    public Customer(String  name, int balance, String email, String phoneNumber){
        this.balance=balance;
        this.name=name;
        cont=new Contact(email, phoneNumber);
    }

    public void getInfo(){
        System.out.println("Bank Name = "+bankName);
        System.out.println("Name = "+ name);
        System.out.println("Balance = "+balance);
        cont.getContactInfo();
    }

}
public class HasARelationship
{
    public static void main(String[] args){
        Customer rahul=new Customer("Rahul Sharma",120,"rahul@gmail.com","8708714686");
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("HasA.txt"));
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("HasA.txt"))){

            oos.writeObject(rahul);
            Customer c=(Customer)ois.readObject();
            c.getInfo();

        }catch(IOException | ClassNotFoundException | NullPointerException e){
            System.out.println(e);
        }

    }
}
