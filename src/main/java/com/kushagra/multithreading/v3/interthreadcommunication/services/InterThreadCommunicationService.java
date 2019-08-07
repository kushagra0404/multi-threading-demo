package com.kushagra.multithreading.v3.interthreadcommunication.services;

import com.kushagra.multithreading.v3.interthreadcommunication.models.Consumer;
import com.kushagra.multithreading.v3.interthreadcommunication.models.Producer;
import com.kushagra.multithreading.v3.interthreadcommunication.models.Product;
import org.springframework.stereotype.Service;

@Service
public class InterThreadCommunicationService {

    public void interThreadCommunication() {
        Product product = new Product();
        Producer producer = new Producer(product);
        Consumer consumer = new Consumer(product);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        consumerThread.start();
        producerThread.start();
    }
}
