package com.kushagra.multithreading.v3.interthreadcommunication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kushagra kumar
 * Module 3:
 * This module is used to demonstrate the inter process communication between threads
 * Producer Consumer Model is taken as example for this module
 * A Consumer can consumer a Product only when Producer has produced any Product.
 */
@SpringBootApplication
public class MultiThreadingApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiThreadingApplication.class, args);
    }
}
