package com.core.java.week2.Day5;

class InValidPhoneNumberException extends Exception{
    public InValidPhoneNumberException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static boolean isValidPhoneNumber(String str) throws InValidPhoneNumberException{
        if(str.matches("\\+91\\s[0-9]{10}")){
            return true;
        }else{
            throw new InValidPhoneNumberException
                    ("Enter the valid Phone Number");
        }

    }

    public static void main(String[] args){
        try{
            System.out.println(isValidPhoneNumber("+92 9896072131"));
        }catch (InValidPhoneNumberException e){
            System.out.println(e);
        }
    }
}
