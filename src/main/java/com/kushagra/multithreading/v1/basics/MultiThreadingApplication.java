package com.kushagra.multithreading.v1.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kushagra kumar
 * This is a sample spring-boot project to illustrate the concepts and implementation of multi threading in Java
 * In order to run the project, start the spring-boot application and hit the relevent Api using postman application.
 * <p>
 * This project consists of four modules
 * Module 1:
 * It consists of basics of multi threading
 * Multi threading can be achieved by two ways:
 * Extend Thread Class
 * Implement Runnable Interface (Recommended)
 * <p>
 * Sometimes you have to hit the api multiple times in order to see the desired result
 * because the context switch bewteen threads can not be controlled
 */
@SpringBootApplication
public class MultiThreadingApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiThreadingApplication.class, args);
    }
}
