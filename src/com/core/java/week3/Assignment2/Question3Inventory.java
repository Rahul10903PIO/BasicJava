package com.core.java.week3.Assignment2;

import com.core.java.week3.Day2.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

class Inventory{
    private String name;
    private int quantity;
    private int price;

    public Inventory(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void getInvetoryInfo(){
        System.out.println(String.format("Name : %s\nQuantity : %d\nPrice : %d\n",this.name,this.quantity,this.price));
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "name='" + name + '\'' +
                '}';
    }

}
public class Question3Inventory {
    public static void main(String[] args) {
        ArrayList <Inventory> TMTbarInventoryList=new ArrayList<>();
        String name[]={ "8mm Bar","16mm Bar","Ring","Wire"};
        int[] quantity={2,2,3,1};
        int[] price={10,5,3,1};

        for(int i=0;i<4;i++){
            TMTbarInventoryList.add(new Inventory(name[i],quantity[i],price[i]));
        }

        //remove
         Iterator<Inventory> itr=TMTbarInventoryList.iterator();
        while(itr.hasNext()){
            Inventory inventory = itr.next();
            if (inventory.getName().equals("16mm Bar")) {
                itr.remove();
            }
        }
        System.out.println(TMTbarInventoryList);

        //Update
        TMTbarInventoryList.set(1,new Inventory("20mm Bar",4,2000));
        System.out.println(TMTbarInventoryList);
    }
}
