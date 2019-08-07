package com.kushagra.multithreading.v2.synchronization.models;

import org.springframework.stereotype.Component;

@Component
public class IdGenerator implements Runnable {
    private  int id = 20;

    @Override
    public void run() {
        generateId();
    }

    public void generateId() {
        if (id <= 0) {
            System.out.println("All Ids are exhausted!");
            return;
        }
        System.out.println("Generated Id: " + id + " Thread: " + Thread.currentThread().getName());
        id--;
        generateId();
    }
}
