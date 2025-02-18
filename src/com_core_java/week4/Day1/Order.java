package com.core.java.week4.Day1;

public class Order {

    public synchronized void orderAdded(Payment payment){
        System.out.println("Order Placed Waiting For Payment Successfull");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        payment.paymentSuccessFul(this);
    }
    public synchronized void orderPlaced(){
        System.out.println("Order Placed");
    }
}

class Payment{

    public synchronized void paymentSuccessFul(Order order) {
        System.out.println("Payment is Waiting for Order Placed");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        order.orderPlaced();
    }
}
