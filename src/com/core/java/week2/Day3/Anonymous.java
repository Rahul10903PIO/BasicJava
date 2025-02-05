package com.core.java.week2.Day3;

interface Vehicles{
    void engineType();
}


public class Anonymous {
    Vehicles cng=new Vehicles() {
        @Override
        public void engineType() {
            System.out.println("Cng");
        }
    };
}
