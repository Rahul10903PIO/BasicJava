package com.core.java.week2.Day1;
import java.util.Scanner;
public class RegEx {


//    Email Validation Code
    public void emailValidation() {
        String emailRegex = "[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Enter the Email");

        while (!flag) {
            String email = sc.nextLine();
            if (emailRegex.matches(email)) {
                System.out.println("Mail is Valid");
                flag = true;
            } else {
                System.out.println("Email is not valid Please Re-Enter");
                flag = false;
            }
        }
    }


//Phone Number Validation
    public void phoneValidation(){
        String phoneRegex = "[+91]\\s[0-9]{10}";
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Enter the Phone Number");

        while (!flag) {
            String phoneNumber = sc.nextLine();
            if (phoneRegex.matches(phoneNumber)) {
                System.out.println("Phone Number is Valid");
                flag = true;
            } else {
                System.out.println("Phone Number is not valid Please Re-Enter");
                flag = false;
            }
        }
    }


//    UserName Validation
    public void nameValidation(){
        String userRegex = "PIO[0-9]{3}";
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Enter the User Name");

        while (!flag) {
            String userName = sc.nextLine();
            if (userRegex.matches(userName)) {
                System.out.println("User Name is Valid");
                flag = true;
            } else {
                System.out.println("User Name is not valid Please Re-Enter");
                flag = false;
            }
        }
    }

    public static void main(String[] args){
        RegEx rg=new RegEx();
        rg.nameValidation();
    }

}
