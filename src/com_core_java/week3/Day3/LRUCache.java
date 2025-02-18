package com.core.java.week3.Day3;

import java.util.LinkedHashMap;
import java.util.Map;

class Date{
    int day;
    int month;
    int year;
    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
class Order{
    int orderId;
    public Order(int orderId){
        this.orderId=orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                '}';
    }
}
class OrderRecord<K,V> extends LinkedHashMap<K,V>{
    int capacity;

    public OrderRecord(int capacity){
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        if(size()>capacity) return true;
        return false;
    }
}
public class LRUCache {
    public static void main(String args[]){
        OrderRecord<Order,Date> or=new OrderRecord<>(5);
        or.put(new Order(1),new Date(1,2,3));
        or.put(new Order(2),new Date(2,2,3));
        or.put(new Order(3),new Date(3,2,3));
        or.put(new Order(4),new Date(4,2,3));
        or.put(new Order(5),new Date(5,2,3));
        or.put(new Order(6),new Date(6,2,3));
        System.out.println(or);
    }
}
