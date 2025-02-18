package com.core.java.week2.Day5;

import java.lang.RuntimeException;

public class Finally {
    public static int sum() throws Exception {
        try {
            return 10 / 0;
        } catch (ArithmeticException e) {
            throw new RuntimeException("Are dhyan se bhai", e);
        } finally {
            throw new RuntimeException("m finally se aaya hoon");
        }
    }

    public static void main(String[] args) {
        try {
            sum();
        } catch (Exception e) {
            System.out.println("Caught in main: " + e);
            Throwable[] suppressed = e.getSuppressed();
            System.out.println("Number of suppressed exceptions: " + suppressed.length);
            for (Throwable t : suppressed) {
                System.out.println("Suppressed: " + t);
            }
        }
    }
}


