package com.core.java.week4.Day1;
import java.util.concurrent.locks.*;

class IRCTC {

    private final Lock lock = new ReentrantLock(true);
    static char seats[] = new char[10];
    static int idx = -1;

    public void reserveSeats() {
        lock.lock();
        if (payment()) {
            idx++;
            seats[idx] = 'R';
            System.out.println("Seat number "+idx+" is reserved by "+ Thread.currentThread().getName());
        } else {
            System.out.println("Payment Failed");
        }
        lock.unlock();
    }

    public boolean payment() {
        lock.lock();
        try {
            Thread.sleep(5000);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
        return false;
    }
}

public class RailwayTicketBooking {
    public static void main(String[] args) {

        IRCTC ir = new IRCTC();

        Runnable t1 = () -> ir.reserveSeats();
        Runnable t2 = () -> ir.reserveSeats();

        Thread th1 = new Thread(t1,"Rahul Sharma");
        Thread th2 = new Thread(t2, "Ritesh Bhai ");

        th1.start();
        th2.start();
    }
}
