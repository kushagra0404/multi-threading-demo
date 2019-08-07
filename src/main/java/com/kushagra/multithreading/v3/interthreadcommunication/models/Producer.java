package com.kushagra.multithreading.v3.interthreadcommunication.models;

import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
    Product product;

    public Producer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        produce(100);
    }

    private void produce(int count) {
        if(count == 0) return;

        synchronized (product) {
            product.setTotalProducedCount(product.getTotalProducedCount() + 1);
            System.out.println("Total items produced till now: " + product.getTotalProducedCount());
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            product.notify();
        }
        count--;
        produce(count);
    }
}
