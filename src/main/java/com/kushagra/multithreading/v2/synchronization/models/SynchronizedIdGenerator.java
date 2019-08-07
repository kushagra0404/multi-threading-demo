package com.kushagra.multithreading.v2.synchronization.models;

public class SynchronizedIdGenerator implements Runnable {
    private volatile int id = 100; //We can also use Atomic Variables here

    @Override
    public void run() {
        generateId();
    }

    public void generateId() {
        synchronized (this) {
            if (id <= 0) {
                System.out.println("All Ids are exhausted!");
                return;
            }
            System.out.println("Generated Id: " + id + " Thread: " + Thread.currentThread().getName());
            id--;
        }
        generateId();
    }
}
