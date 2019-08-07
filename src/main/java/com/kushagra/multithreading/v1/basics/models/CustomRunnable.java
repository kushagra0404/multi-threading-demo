package com.kushagra.multithreading.v1.basics.models;

public class CustomRunnable implements Runnable {
    private int count = 20;

    @Override
    public void run() {
        decreaseCount();
    }

    private void decreaseCount() {
        System.out.println("Count is: " + count + " Thread is: " + Thread.currentThread().getName());

        if (count == 0) {
            return;
        }
        count--;
        decreaseCount();
    }
}
