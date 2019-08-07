package com.kushagra.multithreading.v1.basics.services;

import com.kushagra.multithreading.v1.basics.models.CustomRunnable;
import org.springframework.stereotype.Service;

@Service
public class MultiThreadingDemoService {

    public void startMultiThreadingDemo() {
        CustomRunnable customRunnable1 = new CustomRunnable();
        CustomRunnable customRunnable2 = new CustomRunnable();
        CustomRunnable customRunnable3 = new CustomRunnable();
        CustomRunnable customRunnable4 = new CustomRunnable();

        Thread thread1 = new Thread(customRunnable1);
        Thread thread2 = new Thread(customRunnable2);
        Thread thread3 = new Thread(customRunnable3);
        Thread thread4 = new Thread(customRunnable4);

        thread1.setName("Thread1");
        thread1.start();

        thread2.setName("Thread2");
        thread2.start();

        thread3.setName("Thread3");
        thread3.start();

        thread4.setName("Thread4");
        thread4.start();

        //Another way to achieve multithreading in java by using CustomThread Class that extends Thread class.
        //Uncomment this to see the demo using CustomThread Class.
//        CustomThread customThread1 = new CustomThread();
//        CustomThread customThread2 = new CustomThread();
//        CustomThread customThread3 = new CustomThread();
//        CustomThread customThread4 = new CustomThread();
//
//        customThread1.start();
//        customThread2.start();
//        customThread3.start();
//        customThread4.start();

        //TODO: Implement Join method
        //TODO: Check why only main thread is running everytime
        System.out.println("Inside MultiThreadingDemoService, Thread is" + Thread.currentThread());
    }
}
