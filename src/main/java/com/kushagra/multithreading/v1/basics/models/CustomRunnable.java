package com.kushagra.multithreading.v1.basics.models;

/**
 * @author kushagra
 * @implNote To use multithreading, create a class that implements Runnable interface, override run() method,
 * this is recommended way for multithreading in java
 * @see java.lang.Runnable
 */

public class CustomRunnable implements Runnable {
    private int count = 20;

    @Override
    public void run() {
        decreaseCount();
    }

    private void decreaseCount() {
        System.out.println("Count is: " + count + " Thread is: " + Thread.currentThread());

        if (count == 0) {
            return;
        }
        count--;
        decreaseCount();
    }
}
