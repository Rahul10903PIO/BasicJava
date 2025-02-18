package com.core.java.week4.Day1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FoodOrder implements Runnable {
    private final int orderId;

    public FoodOrder(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        System.out.println("Processing Order #" + orderId + " by "+Thread.currentThread().getName());

        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Order #"+ orderId+" Delivered by "+Thread.currentThread().getName());
    }
}
public class FoodDeliverySystem {
    public static <ExecutorsService> void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i=1; i <= 10 ;i++) {

            executor.submit( new FoodOrder(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        executor.shutdown();
    }
}
