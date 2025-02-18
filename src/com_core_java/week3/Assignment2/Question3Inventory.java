package com.core.java.week3.Assignment2;

import com.core.java.week3.Day2.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product {

    private String name;
    private int quantity;
    private int price;

    public Product(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

class Inventory {

    private List<Product> list=new ArrayList<>();

    public void addProduct(Product p) {
        list.add(p);
    }

    public void removeProduct(String name) {

        for(Product p:list) {
            if(p.getName().equals(name)) {
                list.remove(p);
                System.out.println("Product Removed Successfully");
                break;
            }
        }

    }

    public void updateQuantity(String name,int quantity) {
        for(Product p : list) {
            if(p.getName().equals(name)) {
                p.setQuantity(quantity);
                System.out.println("Quantity Updated Successfully");
                break;
            }
        }
    }

    public void getInvetoryInfo() {
        for(Product p : list){
            System.out.println(String.format("Name : %s\nQuantity : %d\nPrice : %d\n",p.getName(),p.getQuantity(),p.getPrice()));
        }
    }
}
public class Question3Inventory {
    public static void main(String[] args) {

        Inventory cementInventory = new Inventory();
        cementInventory.addProduct(new Product("Ambuja Cement",2,380));
        cementInventory.addProduct(new Product("Ultratech Cement",2,400));
        cementInventory.addProduct(new Product("Dr. Fixit",1,1500));
        cementInventory.addProduct(new Product("Bajri",100,3500));

        cementInventory.getInvetoryInfo();

    }
}
