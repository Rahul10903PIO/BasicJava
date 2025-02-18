package com.core.java.week2.Day5;


import java.util.Scanner;

class InValidUserNameException extends Exception{
    public InValidUserNameException(String msg){
        super(msg);
    }
}

public class MultiException {

    public static boolean isValidPhoneNumber(String str) throws InValidPhoneNumberException{
        if(str.matches("\\+91\\s[0-9]{10}")){
            return true;
        }else{
            throw new InValidPhoneNumberException
                    ("Invalid Phone Number");
        }
    }
    public static boolean isValidUserName(String str) throws InValidUserNameException{
        if(str.matches("PIO[0-9]{4}")){
            return true;
        }else{
            throw new InValidUserNameException("Invalid User Name");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the UserName");
        String userName=sc.nextLine();
        System.out.println("Enter the Phone Number");
        String phoneNumber=sc.nextLine();
        try{
            System.out.println("Is UserName Valid =" +isValidUserName(userName));
            System.out.println("Is Phone Number Valid"+ isValidPhoneNumber(phoneNumber));

        }catch (InValidPhoneNumberException | InValidUserNameException e){
            System.out.println(e);
        }finally{
            System.out.println("Program to Validate user name and phone number");
        }
    }

}
