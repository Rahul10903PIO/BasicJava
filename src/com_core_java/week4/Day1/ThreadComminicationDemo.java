package com.core.java.week4.Day1;

class SharedResources {
    int data;
    boolean hasData;

    public synchronized void consume() {

        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed " + data);
        notify();
    }

    public synchronized void produce(int val) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data=val;
        hasData=true;
        System.out.println("Produced "+val);
        notify();
    }
}

class Producer implements Runnable {

    SharedResources resources;

    public Producer(SharedResources resources) {
        this.resources = resources;
    }

    @Override
    public void run() {
        for(int i=0; i < 10 ; i++) {
            resources.produce(i);
        }
    }
}
class Consumer implements Runnable {

    SharedResources resources;

    public Consumer(SharedResources resources) {
        this.resources = resources;
    }


    @Override
    public void run() {
        for(int i=0; i < 10 ; i++) {
             resources.consume();
        }
    }
}

public class ThreadComminicationDemo {

    public static void main(String[] args) {
        SharedResources resources = new SharedResources();
        Thread produce = new Thread(new Producer(resources));
        Thread consume = new Thread(new Consumer(resources));
        produce.start();
        consume.start();
    }

}
