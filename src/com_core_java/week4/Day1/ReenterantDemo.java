package com.core.java.week4.Day1;

import java.util.concurrent.locks.*;

class Example{
    public void methodA(){
        Lock lock = new ReentrantLock();
        lock.lock();
        try{
            System.out.println("this is method A");
            methodB();
        } finally {
            System.out.println("Finally method A");
            lock.unlock();
        }
    }
    public void methodB(){
        Lock lock =new ReentrantLock();
        lock.lock();
        try {
            System.out.println("This is method B");
        } finally {
            System.out.println("Finally method B");
            lock.unlock();
        }
    }
}
public class ReenterantDemo {
    public static void main(String[] args) {
        Example e = new Example();
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                e.methodA();
            }
        };
        Thread t =new Thread(t1);


        t.start();
    }
}
