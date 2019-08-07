package com.kushagra.multithreading.v1.basics.models;

/**
 * @author kushagra
 * @implNote To use multi threading, create a custom class that extends Thread class and override run() method.
 * @see java.lang.Thread
 */
public class CustomThread extends Thread {
    private int count = 20;

    @Override
    public void run() {
        decreaseCount();
    }

    private void decreaseCount() {
        System.out.println("Count is: " + count + " thread is: " + Thread.currentThread());

        if (count == 0) {
            return;
        }
        count--;
        decreaseCount();
    }
}
