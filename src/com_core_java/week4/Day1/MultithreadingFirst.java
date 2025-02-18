package com.core.java.week4.Day1;

import java.util.ArrayList;
import java.util.List;

class Counter{
    int count=0;

    public  void increment() {
        count++;
    }
    public int getVar() {
        return count;
    }

}

class MyThread implements Runnable{
    Counter c;
    public MyThread(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {
        for (int i=0; i < 10000; i++){
            c.increment();
            if(Thread.interrupted()){
                System.out.println("Thread Interrupted");
                return;
            }

        }
    }
}
public class MultithreadingFirst {

    public static void main(String[] args)throws Exception{

        Counter c=new Counter();
        Thread t=new Thread(new MyThread(c));
        Thread t1=new Thread(new MyThread(c));
        try{
            t.start();
            t1.start();
            t1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }


        Thread.currentThread().sleep(10);
        System.out.println(c.getVar());

    }
}
