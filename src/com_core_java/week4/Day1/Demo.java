package com.core.java.week4.Day1;

import java.util.concurrent.atomic.AtomicInteger;

class ExampleAtomic {

    volatile AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }
    public AtomicInteger getCounter() {
        return counter;
    }
}

public class Demo {

    public static void main(String[] args) {
        ExampleAtomic ea =new ExampleAtomic();

        Thread t1 = new Thread(() -> {
            for(int i=0; i < 1000 ;i++) {
                ea.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=0; i < 1000 ;i++) {
                ea.increment();
            }
        });

        t1.start();
        t2.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ea.getCounter().get());
    }
}
