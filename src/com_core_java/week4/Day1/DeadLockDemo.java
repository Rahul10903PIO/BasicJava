package com.core.java.week4.Day1;

class Task1 implements Runnable{

    Order order;
    Payment payment;

    public Task1(Order order, Payment payment) {
        this.order = order;
        this.payment = payment;
    }

    @Override
    public void run() {
        synchronized (payment) {

            order.orderAdded(payment);
        }

    }
}

class Task2 implements Runnable{
    Order order;
    Payment payment;

    public Task2(Order order, Payment payment) {
        this.order = order;
        this.payment = payment;
    }

    @Override
    public void run() {
        payment.paymentSuccessFul(order);
    }
}
public class DeadLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Order o=new Order();
        Payment p=new Payment();

        Thread order = new Thread( new Task1(o,p));
        Thread payment = new Thread( new Task2(o,p));

        order.start();
        payment.start();

    }
}
