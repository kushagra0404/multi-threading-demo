package com.kushagra.multithreading.v3.interthreadcommunication.models;

public class Consumer implements Runnable {
    Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        consume();
    }

    private void consume() {
        for (; ; ) {
            synchronized (product) {
                if (product.getTotalProducedCount() == product.getTotalConsumedCount()) {
                    System.out.println("Waiting for new Product!!");
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    product.setTotalConsumedCount(product.getTotalConsumedCount() + 1);
                    System.out.println("Total items consumed till now: " + product.getTotalConsumedCount());
                }
            }
        }
    }
}
