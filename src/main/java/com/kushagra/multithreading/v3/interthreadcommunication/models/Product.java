package com.kushagra.multithreading.v3.interthreadcommunication.models;

public class Product {
    private volatile int totalProducedCount = 0;
    private volatile int totalConsumedCount = 0;

    public int getTotalProducedCount() {
        return totalProducedCount;
    }

    public void setTotalProducedCount(int totalProducedCount) {
        this.totalProducedCount = totalProducedCount;
    }

    public int getTotalConsumedCount() {
        return totalConsumedCount;
    }

    public void setTotalConsumedCount(int totalConsumedCount) {
        this.totalConsumedCount = totalConsumedCount;
    }
}
